package com.marsaint.arshiva;

import java.util.HashSet;
import java.util.Set;

public class StudentEqualsMain {

    public static void main(String[] args) {

        StudentEquals s1 = new StudentEquals(12, "Adex");
        StudentEquals s2 = new StudentEquals(02, "Emix");

        System.out.println("s1" + s1.hashCode());
        System.out.println("s2" + s2.hashCode());
        System.out.println(s1.equals(s2));

        System.out.println("===========================");

        Set<StudentEquals> studentsHashSet = new HashSet<>();
        studentsHashSet.add(s1);
        studentsHashSet.add(s2);

        System.out.println(studentsHashSet.size());
        System.out.println(studentsHashSet.contains(s1));
        System.out.println(studentsHashSet.contains(new StudentEquals(12, "Adex")));

        System.out.println("===========================");

        System.out.println("s1: " + s1.hashCode());
        System.out.println("s1: " + s1.getId());
        System.out.println("s1.name: " + s1.getName().hashCode());

        System.out.println("===========================");

        StudentEquals s3 = new StudentEquals(55, "Kenji");
        System.out.println(s3.equals(s3));
        System.out.println(s3.equals(new StudentEquals(55, "Kenji")));

        System.out.println("===========================");

        for (StudentEquals s : studentsHashSet) {
            System.out.println(s.toString());
        }

        studentsHashSet.add(s3);
        studentsHashSet.add(s3);
        studentsHashSet.add(s3);
        studentsHashSet.add(new StudentEquals(55, "Kenji"));

        System.out.println("======== added s3 twice =========");

        for (StudentEquals s : studentsHashSet) {
            System.out.println(s.toString());
        }

    }

}
