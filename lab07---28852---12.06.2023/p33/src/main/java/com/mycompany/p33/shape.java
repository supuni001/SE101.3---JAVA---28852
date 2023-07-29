package com.mycompany.p33;
// Shape class
abstract class Shape 
{
    // Abstract method to calculate area (no implementation here)
    public abstract double calculateArea();

    // Non-abstract method to display the shape's area
    public void display() {
        double area = calculateArea();
        System.out.println("Area: " + area);
    }
}