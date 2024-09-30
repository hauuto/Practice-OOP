package edu.iuh.fit.bai01;

/**
 * This class will get length \& width
 * and calculate area and perimeter
 * of Rectangle
 */
public class Rectangle {
    //Attributes
    private double length;
    private double width;


    //Constructors

    //Default Constructor
    public Rectangle(){
        length=0.0;
        width=0.0;

    }

    //Constructor with parameters
    public Rectangle(double l, double w){
        if (l < 0 || w < 0){
            throw new IllegalArgumentException("Length and width cannot be less than zero");
        }
        length = l;
        width = w;
    }



    //Getters

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    //Setters

    /**
     * Set the length of Rectangle
     * @param l
     * @throws IllegalArgumentException if length is less than 0
     */
    public void setLength(double l){
        if (l < 0)
            throw new IllegalArgumentException("Length cannot be negative");
        this.length = l;
    }

    /**
     * get the width of Rectangle
     * @param w
     * @throws IllegalArgumentException if width is less than 0
     */
    public void setWidth(double w){
        if (w < 0)
            throw new IllegalArgumentException("Width cannot be negative");
        this.width = w;
    }


    //Methods

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*length+2*width;
    }


}
