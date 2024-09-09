/*
 * @ (#) Cylinder.java       1.0      9/3/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package iuh.fit.bai03;

/**
 * @description: This class will describe a cylinder
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/3/2024 11:35 PM
 */
public class Cylinder {

    //Attributes
    private double radius;
    private double height;

    //Constructors
    //Default constructor
    public Cylinder() {
        radius = 0;
        height = 0;
    }
    public Cylinder(double radius, double height){
        setHeight(height);
        setRadius(radius);
    }


    //Getters and Setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0){
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        this.height = height;
    }

    //Methods

    public double getVolume(){
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }


    public double getLateralArea(){
        return 2 * Math.PI * radius * height;
    }

    @Override
    public String toString(){
        return String.format("%-10.2f %-10.2f %-15.2f %-15.2f %-15.2f", radius, height, getLateralArea(), getSurfaceArea(), getVolume());
    }
}
