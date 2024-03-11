package strategy;


import java.util.Calendar;

enum Weeks{
    MONDAY("mon", 1),
    TUESDAY("tue", 2),
    WEDNESDAY("wed", 3),
    THURSDAY("thu", 4),
    FRIDAY("fri", 5),
    STURDAY("sat", 6),
    SUNDAY("sun", 7);

    private final String name;
    private final int value;

    private Weeks(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}

public class WhatDay {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);


    }

}
