//EXERCISE 01
package com.mycompany.main;

// Test class to invoke Student and Lecturer
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Tom", 12345, "MIS");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Course: " + student.getCourse());

        // Creating a Lecturer object
        Lecturer lecturer = new Lecturer("Dr. Shafraz", 67890, "JAVA");
        System.out.println("\nLecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}