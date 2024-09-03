/*
 * @ (#) Point.java       1.0      9/3/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


package bai02;

/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/3/2024 10:49 PM
 */
public class Point extends bai01.Point {


    //Constructors

    //Default constructor
    public Point() {
        super();
    }
    public Point(String name, double x, double y){
        super(name, x, y);
    }


    //Methods

    //This methods will return the distance from O(0,0) to the point
    public double getDistance(Point p){
        return Math.sqrt(Math.pow(-p.getX(),2) + Math.pow(-p.getY(),2));
    }

    public Point negate(){
        return new Point(getName(), -getX(), -getY());
    }

    @Override
    public String toString(){
        return String.format("%s(%.1f, %.1f)\t\t%.2f\t\t\t%s(%.1f,%.1f)", getName(), getX(), getY(), getDistance(this), negate().getName(), negate().getX(), negate().getY());
    }
}
