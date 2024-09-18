/*
 * @ (#) TestPoint.java       1.0      9/3/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai01;

/**
 * @description: This class will test the Point class
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/3/2024 10:44 PM
 */
public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point("A", 3, 4);
        Point p2 = new Point("B", 0, 0);


        System.out.println(p1.getThongTin());
        System.out.println(p2.getThongTin());

        System.out.println(p1);
        System.out.println(p2);
    }
}
