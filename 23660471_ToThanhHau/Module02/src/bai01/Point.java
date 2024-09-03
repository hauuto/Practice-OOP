/*
 * @ (#) Point.java       1.0      9/3/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package bai01;

/**
 * @description: This class is used to manage information of a point
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/3/2024 10:33 PM
 */
public class Point {

    //Attributes
    private double x;
    private double y;
    private String name;


    //Constructors

    //Default constructor
    public Point() {
        x = 0;
        y = 0;
        name = "";
    }
    public Point(String name, double x, double y){
        setName(name);
        setX(x);
        setY(y);
    }


    //Getters and Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty");

        }
        this.name = name;
    }

    //Methods

    public String getThongTin(){
        return String.format("%s(%.1f, %.1f)", name, x, y);
    }

    @Override
    public String toString() {
        return getThongTin();
    }
}
