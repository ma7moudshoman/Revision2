package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car2 {

    static void Interface(SelfDrivable selfDrivable){
        selfDrivable.drive();
    }


    public static void main(String[]args){
      /*  Interface (new CarV1());
        Interface(new CarV2());


SelfDrivable s=new CarV1();
 s.drive();
      s=new CarV2();
      s.drive();*/
        GenericInterface <car1> genericInterface=new car1();

        car1 car1=genericInterface.carModel();
       }
}
