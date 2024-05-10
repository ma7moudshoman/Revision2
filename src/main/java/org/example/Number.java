package org.example;

import java.time.DayOfWeek;
import java.time.Month;

import static org.example.Numbers.THREE;

public class Number {
    interface test{

    }

    enum Weekday {
        monday("working day"){
            @Override
            public void testmethod(){
                System.out.println("k;fv;cm");
            };
           }, tuesday {
                    @Override
                    public void testmethod(){
                        System.out.println("ghitpt");
                    }
                }; //wednesday, thursday, friday(" day Off"), saturday, sunday;
        String status;

        Weekday(String status) {
            this.status = status;
        }
        public abstract void testmethod();
       Weekday(){

          }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static void main(String[]args){
        System.out.println(DayOfWeek.FRIDAY);
        System.out.println(Month.APRIL);
       Weekday.monday.testmethod();
      //  System.out.println(Weekday.monday.status);

   /*  final    int One=1;
      final   int TWO=2;
        final int THREE=3;*/
     Numbers val=Numbers.ONE;
      //  int val=1;
        switch (val){
            case ONE :
                System.out.println("1");
                break;
            case TWO:
                System.out.println("2");
                break;
            case THREE:
                System.out.println("3");

        }


    }
}
