package com.glasiem.homework3.main;

import com.glasiem.homework3.groups.Group;
import com.glasiem.homework3.students.BadStudent;
import com.glasiem.homework3.students.GoodStudent;
import com.glasiem.homework3.students.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new GoodStudent("Nazar Vinnichuk");
        Student s2 = new BadStudent("Georhiy Sudarkin");
        Group myGroup = new Group("K-25");
        myGroup.addStudent(s1);
        myGroup.addStudent(s2);
        myGroup.getInfo();
        myGroup.getFullInfo();
        s1.study();
        s2.study();
        myGroup.getFullInfo();
    }
}
