package com.marsaint.arshiva;

import java.util.Comparator;

public class Dog implements Comparator<Dog> {

    private String name;
    private int age;

    public Dog() {

    }

    public Dog(String n, int a){
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compare(Dog d1, Dog d2) {
        if (d1.age < d2.age) {
            return -1;
        } else if (d1.age > d1.age) {
            return 1;
        } else {
            return 0;
        }
    }
}
