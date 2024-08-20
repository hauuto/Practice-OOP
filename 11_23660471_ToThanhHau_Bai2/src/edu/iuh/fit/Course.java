package edu.iuh.fit;

public class Course {


    //Attributes
    private String id;
    private String title;
    private int credit;
    private String department;


    //Constructors
    public Course(){
        this("","",0,"");
    //  this.id = "";
    //  this.title = "";
    //  this.credit = 0;
    //  this.department = "";

    }

    public Course(String title, String id, int credit, String department) {
        this.title = title;
        this.id = id;
        this.credit = credit;
        this.department = department;
    }

    //Getters

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCredit() {
        return credit;
    }

    public String getDepartment() {
        return department;
    }

    //Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredit(int credit) {
        if (credit < 0) {
            throw new IllegalArgumentException("Credit must be a positive number");
        }
        this.credit = credit;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return String.format("%-10s%-30s%5d  %-10s", id, title,credit,department); // - canh trai, ko dau canh phai
                                    // Chuoi canh trai, so canh phai
    }
}
