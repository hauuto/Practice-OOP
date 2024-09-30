package edu.iuh.fit.bai01;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();

        System.out.println("L: " + rec1.getLength());
        System.out.println("W: " + rec1.getWidth());


        System.out.println();


        rec1.setLength(15);
        rec1.setWidth(10);

        System.out.println("L: " + rec1.getLength());
        System.out.println("W: " + rec1.getWidth());


        System.out.println();


        Rectangle rec2 = new Rectangle(10,6);

        System.out.println("L: " + rec2.getLength());
        System.out.println("W: " + rec2.getWidth());
        System.out.println("Area: " + rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());
    }
}
