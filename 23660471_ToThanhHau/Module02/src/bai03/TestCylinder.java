/*
 * @ (#) TestCylinder.java       1.0      9/4/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package bai03;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/4/2024 2:42 AM
 */
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(1, 2);

        System.out.printf("%-10s %-10s %-15s %-15s %-15s\n", "Radius", "Height", "Lateral Area", "Surface Area", "Volume");
        System.out.println(c1);
    }
}
