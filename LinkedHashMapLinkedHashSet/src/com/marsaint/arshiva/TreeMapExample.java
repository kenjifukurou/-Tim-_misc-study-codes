package com.marsaint.arshiva;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    private static Map<Integer, String> treeMap;

    static void createTreeMap() {
        treeMap = new TreeMap<>();
        System.out.println("tree map created");
    }

    static void insert() {
        treeMap.put(10, "Geeks10");
        treeMap.put(15, "Geeks15");
        treeMap.put(91, "Geeks91");
        treeMap.put(1, "Geeks1");
        treeMap.put(6, "Geeks6");
        treeMap.put(29, "Geeks29");

        System.out.println("inserted 6 elements into treeMap");

    }

    static void search(int key) {
        System.out.println("search contents: " + key);
        System.out.println(treeMap.containsKey(key));

    }

    static void display() {
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
//        System.out.println("treeMap: " + treeMap);
    }

//    @Override
//    public String toString() {
////        return super.toString();
//        String s = "";
//        for (Map.Entry<Integer, String> mapEntry : treeMap.entrySet()) {
//            s += mapEntry.getKey() + ": " + mapEntry.getValue() + "\n";
//        }
//        return s;
//    }

    public static void main(String[] args) {
        createTreeMap();
        insert();
        search(6);
        display();

        System.out.println(treeMap.toString());
    }

}

