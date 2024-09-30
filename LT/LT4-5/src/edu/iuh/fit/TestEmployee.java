/*
 * @ (#) TestEmployee.java       1.0      8/27/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package edu.iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 8/27/2024 7:35 AM
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Manager("101","Thanh Hau", LocalDate.of(2003,7,4),30000,10000);
        System.out.println(emp);
    }
}
