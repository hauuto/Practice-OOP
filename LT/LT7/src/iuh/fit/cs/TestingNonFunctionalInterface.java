/*
 * @ (#) TestingNonFunctionalInterface.java       1.0      9/24/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.cs;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/24/2024 6:59 AM
 */
public class TestingNonFunctionalInterface {
    public static void main(String[] args) {
        MyInterface add = (a, b) -> a + b;
        System.out.println(add.sum(1, 2));
        add.printInfor();
        MyInterface.printInfor2();
    }
}
