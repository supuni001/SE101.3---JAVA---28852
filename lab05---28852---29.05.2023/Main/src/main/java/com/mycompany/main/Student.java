package com.mycompany.main;

// Student class (subclass of Person)
class Student extends Person {
    private String course;

    // Constructor
    public Student(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    // Getter and setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}