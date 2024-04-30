package org.example;

public class Doman{

    static void print1(Car k){
       k.autoPilote();

    }
    public static void main(String[]args){

   Car car1=new SUV();
   print1(car1);

   Car car=new Hatchback();
   print1(car);
    }
}
