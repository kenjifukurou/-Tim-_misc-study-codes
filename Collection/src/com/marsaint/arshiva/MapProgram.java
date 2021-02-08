package com.marsaint.arshiva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> programming = new HashMap<>();
        programming.put("Java", "...java...");
        programming.put("Python", "...python...");
        programming.put("C#", "...C#...");
        programming.put("C++", "...C++...");
        programming.put("BASIC", "...BASIC...");

        System.out.println(programming);

        System.out.println(programming.get("Java"));
        System.out.println(programming.get("JAVA"));

        System.out.println("==============================");

        List<String> keyList = new ArrayList<>();
        List<String> valueList = new ArrayList<>();

        for (String i : programming.keySet()) {
            keyList.add(i);
        }

        for (String i : programming.values()) {
            valueList.add(i);
        }

        printList(keyList, valueList);

        addMap(programming, "Lisp", "hell language");
        addMap(programming, "Lisp", "hell language");

        System.out.println("==============================");

        printListSimplify(programming);

        System.out.println("==============================");

        programming.replace("Java", "Pain in the Ass");
        printListSimplify(programming);

    }

    public static void printListSimplify(Map<String, String> map) {
        for (String i : map.keySet()) {
            System.out.println(i + " : " + map.get(i));
        }
    }

    public static void printList(List<String> key, List<String> value) {
        for (int i=0; i<key.size(); i++) {
            System.out.println(key.get(i) + " : " + value.get(i));
        }
    }

    public static boolean addMap(Map<String, String> map, String key, String value) {
        if (map.containsKey(key)) {
            System.out.println(key + " already in map");
            return false;
        } else {
            map.put(key, value);
            System.out.println(key + " added to map");
            return true;
        }
    }
}
