package com.marsaint.arshiva;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1; i<=100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("square: " + squares.size());
        System.out.println("cubes: " + cubes.size());

        System.out.println("==============================");
        List<Integer> squaresList = new ArrayList<>(squares);
        List<Integer> cubesList = new ArrayList<>(cubes);

        Collections.sort(squaresList);
        Collections.sort(cubesList);

        System.out.println("============== int in square: ================");
        printSetContents(squaresList);

        System.out.println("============== int in cube: ================");
        printSetContents(cubesList);

        System.out.println("==============================");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union: " + union.size());

        Set<Integer> intersect = new HashSet<>(squares);
        intersect.retainAll(cubes);
        System.out.println("intersect: " + intersect.size());

        for (double i : intersect) {
//            System.out.println("intersect number is: " + i);
            System.out.println("math square root: " + Math.sqrt(i));
        }

        for (double i : intersect) {
            System.out.println("math cube square root: " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day i will be millionaire";
        String[] splitSentence = sentence.split(" ");
        words.addAll(Arrays.asList(splitSentence));

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("==============================");

        Set<String> stringSet1 = new HashSet<>();
        Set<String> stringSet2 = new HashSet<>();
        String sentence1 = "If you're looking for random paragraphs, you've come to the right place, random sentence isn't quite enough";
        String sentence2 = "When a random word or a random sentence isn't quite enough, If you're looking";
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        stringSet1.addAll(Arrays.asList(words1));
        stringSet2.addAll(Arrays.asList(words2));

        System.out.println(stringSet1.size());
        System.out.println(stringSet2.size());

        System.out.println("============= StringSet1 - StringSet2 =============");
        Set<String> diff1 = new HashSet<>(stringSet1); //diff1 is stringSet1 copy
        printSet(diff1);
        diff1.removeAll(stringSet2);
        printSet(diff1);

        System.out.println("============= StringSet2 - StringSet1 =============");
        Set<String> diff2 = new HashSet<>(stringSet2); //diff1 is stringSet1 copy
        printSet(diff2);
        diff2.removeAll(stringSet1);
        printSet(diff2);


    }

    private static void printSet(Set<String> set) {
        System.out.println("\t" + "set's strings:");
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void printSetContents(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }

}
