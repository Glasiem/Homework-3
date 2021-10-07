package com.glasiem.homework3.students;

public abstract class Student {
    private String name, state;

    public Student(String name) {
        this.name = name;
        this.state = "";
    }

    public Student(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public void relax(){
        this.state += "Relax ";
    }

    public void read(){
        this.state += "Read ";
    }

    public void write(){
        this.state += "Write ";
    }

    public String getStudentInfo(){
        return name;
    }

    public String getFullStudentInfo(){
        return name + " " + state;
    }

    public abstract void study();
}
