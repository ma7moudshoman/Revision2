package org.example;

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
      RewardClass d=new RewardClass();
        RewardClass d1=new RewardClass(){ @Override
        public void Class(){
            System.out.println("your reword is 30 $");
        }};
        RewardClass d3=new RewardClass(){
            @Override
            public void Class(){
                System.out.println("your reword is 30 $");
            }
        } ;
        new RewardClass(){
            @Override
            public void Class(){
                System.out.println("your reword is 30 $");
            }
        } .Class();
        System.out.println(d.getClass());
        System.out.println(d3.getClass());
        System.out.println(d1.getClass() );
        d.Class();
d3.Class();
        d1.Class();

       }
}
