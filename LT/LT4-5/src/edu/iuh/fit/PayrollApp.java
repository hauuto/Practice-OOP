/*
 * @ (#) PayrollApp.java       1.0      9/17/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package edu.iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/17/2024 7:20 AM
 */
public class PayrollApp {
    public static void main (String[] args){

        Employee emp1 = new HourlyEmployee("EMP101","Thanh Hau", LocalDate.of(2003,7,4), 100, 10);
        Employee emp2 = new SalariedEmployee("EMP102","Thanh Hau", LocalDate.of(2003,7,4), 10000);
        Employee emp3 = new Manager("EMP103","Thanh Hau", LocalDate.of(2003,7,4), 10000, 1000);

        EmployeeList list = new EmployeeList();

        list.addEmployee(emp1);
        list.addEmployee(emp2);
        list.addEmployee(emp3);


        Employee[] employees = list.listEmployees();
        for (Employee emp : employees){
            System.out.println(emp);
       }

    }
}
