package org.example;

public interface SelfDrivable  {

    public  void destination(String d);
    public void drive();
    default void NewMethod(){
        System.out.println("dvdj");
    }
}
