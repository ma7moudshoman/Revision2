package org.example;

import java.util.EnumSet;

public class Enumset {
    enum WeekDays{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }
    public static void main(String[]args){
       // EnumSet<WeekDays>days=EnumSet.allOf(WeekDays.class);
        //EnumSet<WeekDays>days1=EnumSet.of(WeekDays.FRIDAY,WeekDays.MONDAY,WeekDays.FRIDAY);// it will return just one object because set Prevents repetition
       EnumSet<WeekDays>days2=EnumSet.range(WeekDays.WEDNESDAY,WeekDays.FRIDAY);
        EnumSet<WeekDays>days3=EnumSet.noneOf(WeekDays.class);
        days3.add(WeekDays.FRIDAY);
        days3.addAll(days2);
        days3.remove(WeekDays.THURSDAY);
       days3.removeAll(days2);
        System.out.println(days3);

        //System.out.println(days2);
       // System.out.println(days );
        //System.out.println(days1);
    }
}
