/*
 * @ (#) TestHinhTamGiac.java       1.0      9/30/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai05;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/30/2024 4:26 PM
 */
public class TestHinhTamGiac {
    public static void main(String[] args){
        //Create 5 triangle, 2 of them are invalid, 3 of them are, 1 is equilateral, 1 is isosceles, 1 is scalene
        HinhTamGiac htg1 = new HinhTamGiac(3, 4, 5);
        HinhTamGiac htg2 = new HinhTamGiac(3, 4, 8);
        HinhTamGiac htg3 = new HinhTamGiac(3, 3, 3);
        HinhTamGiac htg4 = new HinhTamGiac(3, 3, 4);
        HinhTamGiac htg5 = new HinhTamGiac(3, 4, 6);

        //Print the result with the format of the table
        System.out.printf("%-11s\t\t%s\t\t%s\t\t%s\n","Triangle","Type","Perimeter","Area");
        System.out.println(htg1);
        System.out.println(htg2);
        System.out.println(htg3);
        System.out.println(htg4);
        System.out.println(htg5);
    }
}
