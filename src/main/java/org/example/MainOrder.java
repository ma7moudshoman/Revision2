package org.example;

import java.util.Arrays;

public class MainOrder {
    enum WeekDays{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }
    public static void main(String []args){

       // System.out.println(WeekDays.SATURDAY.ordinal());
       //  System.out.println(WeekDays.SUNDAY.compareTo(WeekDays.WEDNESDAY));
        // System.out.println(WeekDays.TUESDAY.toString()=="TUESDAY");
        //System.out.println(WeekDays.TUESDAY.name() =="TUESDAY");
       // System.out.println(WeekDays.valueOf("WEDNESDAY"));
       /*for (WeekDays day:WeekDays.values()){
           System.out.println(day);
       }
        System.out.println(Arrays.toString(WeekDays.values()));

*/

        WeekDays days=WeekDays.FRIDAY;
if (days .equals( WeekDays.SATURDAY)){
        }
        /*

Order order =new Order();
        order.setStatus(Order.OrderStatus.COMPLETED);
        System.out.println(order.getStatus() );
*/

    }
}
