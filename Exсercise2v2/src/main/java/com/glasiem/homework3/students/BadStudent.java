package com.glasiem.homework3.students;

public class BadStudent extends Student{
    public BadStudent(String name) {
        super(name," bad");
    }

    @Override
    public void study() {
        relax();
        relax();
        relax();
        relax();
        read();
    }
}
