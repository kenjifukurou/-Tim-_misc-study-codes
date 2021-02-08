package com.marsaint.arshiva;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

    public static void main(String[] args) {

        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Mango");
        hashmap.put(2, "Apple");
        hashmap.put(3, "Banana");
        hashmap.put(4, "Grapes");
        hashmap.put(5, null);

        System.out.println("iterating hashmap...");
        for (Map.Entry m : hashmap.entrySet()) {
            System.out.println(m);
        }

        System.out.println(hashmap.entrySet());

        System.out.println("===================");

        System.out.println(hashmap.getOrDefault(1, "no value"));
        System.out.println(hashmap.getOrDefault(2, "no value"));
        System.out.println(hashmap.getOrDefault(5, "no value"));

        System.out.println(hashmap.get(9));
        System.out.println(hashmap.getOrDefault(9, "no value"));
        System.out.println(hashmap.getOrDefault(12, "default value"));


        System.out.println(hashmap.entrySet());


    }

}
