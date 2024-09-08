/*
 * @ (#) StudentGrade.java       1.0      9/4/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package bai04;

/**
 * @description: This class is used to manage information of a student grade
 *              including student ID, student name, practice grade, theory grade
 *              and average grade of a student
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/4/2024 1:29 PM
 */
public class StudentGrade {

    //Attributes
    private int studentID;
    private String studentName;
    private double practiceGrade;
    private double theoryGrade;



    //Constructors

    //Default constructor
    public StudentGrade() {
        studentID = 0;
        studentName = "";
        practiceGrade = 0;
        theoryGrade = 0;
    }

    public StudentGrade(int studentID, String studentName, double practiceGrade, double theoryGrade){
        setStudentID(studentID);
        setStudentName(studentName);
        setPracticeGrade(practiceGrade);
        setTheoryGrade(theoryGrade);
    }

    //Getters and Setters

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if (studentID <= 0){
            throw new IllegalArgumentException("Student ID must be greater than 0");
        }
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        if (studentName == null || studentName.isEmpty()){
            throw new IllegalArgumentException("Student name must not be null or empty");
        }
        this.studentName = studentName;
    }

    public double getPracticeGrade() {
        return practiceGrade;
    }

    public void setPracticeGrade(double practiceGrade) {
        if (practiceGrade < 0.0 || practiceGrade > 10.0){
            throw new IllegalArgumentException("Practice grade must be in range [0.0, 10.0]");
        }
        this.practiceGrade = practiceGrade;
    }

    public double getTheoryGrade() {
        return theoryGrade;
    }

    public void setTheoryGrade(double theoryGrade) {
        if (theoryGrade < 0.0 || theoryGrade > 10.0){
            throw new IllegalArgumentException("Theory grade must be in range [0.0, 10.0]");
        }
        this.theoryGrade = theoryGrade;
    }


    //Methods
    public double getAverageGrade(){
        return (practiceGrade + theoryGrade) / 2;
    }

    @Override
    public String toString(){
        return String.format("%-15s %-30s %-10s %-10s %-10s", studentID, studentName, practiceGrade, theoryGrade, getAverageGrade());
    }
}
