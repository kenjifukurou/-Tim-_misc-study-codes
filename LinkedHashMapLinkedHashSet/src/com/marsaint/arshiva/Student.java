package com.marsaint.arshiva;

public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age == o.age) {
            return 0;
        } else if (o.age > this.age) {
            return -1;
        }
        return 1;
    }
}
