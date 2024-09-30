/*
 * @ (#) Manager.java       1.0      8/27/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package edu.iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 8/27/2024 7:49 AM
 */
public class Manager extends SalariedEmployee{

    private static final int WEEKS_PER_YEAR = 52;
    //Attributes
    private double bonus;

    //Constructors
    //Default constructors
    public Manager(){
        super();
        this.bonus = 0;
    }

    public Manager(String id, String name, LocalDate dob, double annualSalary, double bonus){
        super(id, name, dob, annualSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%15.2f",bonus);
    }

    @Override
    public double weeklyPay(){
        return annualSalary / WEEKS_PER_YEAR + bonus;
    }

}
