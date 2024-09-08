/*
 * @ (#) TestStudent.java       1.0      9/4/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package bai04;

import java.util.Scanner;

/**
 * @description: This class will test all methods of StudentGrade class
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/4/2024 1:44 PM
 */
public class TestStudent {
    public static void main(String[] args){
        StudentGrade student1 = new StudentGrade(23660471, "To Thanh Hau",6.3, 7.5);
        StudentGrade student2 = new StudentGrade(23660472, "Thai Nguyen Tue Minh", 7.5, 8.5);
        StudentGrade student3 = new StudentGrade();


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student 3 ID: ");
        student3.setStudentID(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter student 3 name: ");
        student3.setStudentName(sc.nextLine());
        System.out.println("Enter student 3 practice grade: ");
        student3.setPracticeGrade(sc.nextDouble());
        System.out.println("Enter student 3 theory grade: ");
        student3.setTheoryGrade(sc.nextDouble());


        System.out.printf("%-15s %-30s %-10s %-10s %-10s\n","ID","Name","Practice","Theory","Average");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
