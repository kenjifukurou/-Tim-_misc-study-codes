package com.marsaint.arshiva;

public class EnumTest {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    Day day;
    String name;

    public EnumTest(Day day) {
        this.day = day;
        this.name = "Week";
    }

    public void daysInWeek() {
        switch (day) {
            case MONDAY:
                System.out.println("Monday are bad");
                break;

            case TUESDAY:
                System.out.println("Friday are best");
                break;

            case  SATURDAY: case SUNDAY:
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Midweek");
                break;
        }
    }
}
