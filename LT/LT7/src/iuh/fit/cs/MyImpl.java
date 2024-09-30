/*
 * @ (#) MyImpl.java       1.0      9/24/2024
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
public class MyImpl implements MyInterface {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MyImpl myImpl = new MyImpl();
        System.out.println(myImpl.sum(1, 2));
        myImpl.printInfor();
        MyInterface.printInfor2();
    }
}
