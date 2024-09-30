/*
 * @ (#) TestingFunctionalInterface.java       1.0      9/24/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.cs;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/24/2024 6:58 AM
 */
public class TestingFunctionalInterface {
    public static void main(String[] args) {
        MyInterface myInterface = (a, b) -> a + b;
        System.out.println(myInterface.sum(1, 2));
        myInterface.printInfor();
        MyInterface.printInfor2();
    }
}
