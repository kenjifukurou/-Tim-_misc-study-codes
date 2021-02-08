package com.marsaint.arshiva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("Lemon", 12));
        dogs.add(new Dog("Peter", 4));
        dogs.add(new Dog("Cid", 2));
        dogs.add(new Dog("Move", 6));
        dogs.add(new Dog("King", 8));

        printList(dogs);

        System.out.println("=================");

        Collections.sort(dogs, new Dog());

        printList(dogs);

    }

    public static void printList(List<Dog> dogList) {
        for (Dog dog : dogList) {
            System.out.println(dog.getName() + " , " + dog.getAge());
        }
    }
}
