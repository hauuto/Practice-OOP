/*
 * @ (#) Employee.java       1.0      8/27/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */

package edu.iuh.fit;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 8/27/2024 7:22 AM
 */
public abstract class Employee {


    //Attributes
    protected  String id;
    protected  String name;
    protected LocalDate dob;


    //Constructor
    public Employee() {
        this("","",LocalDate.now());
    }

    public Employee(String id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }



    //Setters Getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    //Methods
    public abstract double weeklyPay();


    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s%-10s%-20s%15s%10s",getClass().getSimpleName(), id,name,dob.format(df2),df.format(weeklyPay()));
    }
}
