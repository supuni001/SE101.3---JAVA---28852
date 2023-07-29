package com.mycompany.p33;
// Rectangle subclass
class Rectangle extends Shape 
{
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}