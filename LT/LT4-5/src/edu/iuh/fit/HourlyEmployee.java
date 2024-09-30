/*
 * @ (#) HourlyEmployee.java       1.0      8/27/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package edu.iuh.fit;

import java.time.LocalDate;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 8/27/2024 7:47 AM
 */
public class HourlyEmployee extends Employee{

    private static final int HOURLY_MAX = 40;
    //Attributes
    private int hoursWorked;
    private double hourlyWage;


    //Constructor

    //Default
    public HourlyEmployee(){
        super();
        this.hoursWorked = 0;
        this.hourlyWage = 0.0;

    }

    public HourlyEmployee(String id, String name, LocalDate dob, int hoursWorked, double hourlyWage){
        super(id, name, dob);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override

    public String toString(){
        return super.toString() + String.format("%5d%15.2f",hoursWorked,hourlyWage);
    }

    @Override
    public double weeklyPay(){
        return hoursWorked > HOURLY_MAX ?
                (HOURLY_MAX +(hoursWorked-HOURLY_MAX)*1.5)*hourlyWage :
                hoursWorked * hourlyWage;
    }




}
