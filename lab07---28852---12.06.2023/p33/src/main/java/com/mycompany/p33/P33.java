//  question02  
package com.mycompany.p33;
// Main class to test the shape classes
public class P33 
{
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Displaying the areas of Circle and Rectangle
        circle.display();
        rectangle.display();
    }
}
