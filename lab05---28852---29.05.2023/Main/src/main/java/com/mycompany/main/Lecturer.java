package com.mycompany.main;
// Lecturer class (subclass of Person)
class Lecturer extends Person {
    private String programme;

    // Constructor
    public Lecturer(String name, int id, String programme) {
        super(name, id);
        this.programme = programme;
    }

    // Getter and setter for programme
    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}