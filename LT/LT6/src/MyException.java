/*
 * @ (#) MyException.java       1.0      9/17/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/17/2024 7:42 AM
 */
public class MyException extends Exception {

    private String messString;

    public MyException(String messString) {
        super(messString);
    }

    // Unchecked exception --> RuntimeException
    // Checked exception --> Exception

}
