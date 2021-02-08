package com.marsaint.arshiva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student("Jackson", 26);
        Student student2 = new Student("Nikki", 18);
        Student student3 = new Student("Pussy", 95);
        Student student4 = new Student("Jibeh", 38);

        System.out.println(student1.toString());
        System.out.println(student2.toString());


        int resultCompareTo = student3.compareTo(student4);

        switch (resultCompareTo) {
            case 0:
                System.out.println("same age");
            case 1:
                System.out.println("student A is older than student B");
            case -1:
                System.out.println("student B is older than student B");
        }

        System.out.println("====================");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        System.out.println("====================");

        Collections.sort(students);
        System.out.println(students);

    }
}
