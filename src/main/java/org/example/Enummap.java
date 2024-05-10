package org.example;

import java.util.EnumMap;

public class Enummap {

    enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {

EnumMap<WeekDays,String>day=new EnumMap<>(WeekDays.class);
day.put(WeekDays.MONDAY,"Working day");
        day.put(WeekDays.FRIDAY,"Day OFF");

        System.out.println(day);
    }
}