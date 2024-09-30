/*
 * @ (#) SalariedEmployee.java       1.0      8/27/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package edu.iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 8/27/2024 7:48 AM
 */
public class SalariedEmployee extends Employee {

    private static final double WEEKS_PER_YEAR = 52;
    //Attributes
    protected double annualSalary;



    //Constructors
    //Default constructors
    public SalariedEmployee(){
        super();
        this.annualSalary = 0.0;
    }

    public SalariedEmployee(String id, String name, LocalDate dob, double annualSalary) {
        super(id, name, dob);
        this.annualSalary = annualSalary;
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }



    @Override
    public String toString() {
        return super.toString() + String.format("%15.2f",annualSalary);
    }

    @Override
    public double weeklyPay(){
        return annualSalary / WEEKS_PER_YEAR;
    }
}
