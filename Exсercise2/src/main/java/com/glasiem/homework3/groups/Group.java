package com.glasiem.homework3.groups;

import com.glasiem.homework3.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students = new ArrayList<>(30);

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student st){
        this.students.add(st);
    }

    public void getInfo(){
        System.out.println(this.groupName);
        for (int i = 0; i < this.students.size(); i++) {
            System.out.println(students.get(i).getStudentInfo());
        }
    }

    public void getFullInfo(){
        System.out.println(this.groupName);
        for (int i = 0; i < this.students.size(); i++) {
            System.out.println(students.get(i).getFullStudentInfo());
        }
    }
}
