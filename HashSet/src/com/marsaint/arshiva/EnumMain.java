package com.marsaint.arshiva;

public class EnumMain {

    public static void main(String[] args) {

        EnumTest myDays = new EnumTest(EnumTest.Day.MONDAY);
        myDays.daysInWeek();

        EnumTest myDay2 = new EnumTest(EnumTest.Day.SUNDAY);
        myDay2.daysInWeek();

        System.out.println(myDays.hashCode());

//        System.out.println(myDay2.day.ordinal());

        System.out.println(EnumTest.Day.MONDAY.ordinal());
        System.out.println(EnumTest.Day.SATURDAY.ordinal());

    }

}
