package org.example;

public class F {

    static void f(){
        System.out.println("f () ");
        f();
    }
    public static void main(String[]args){
            try {
                f();
            }catch (Error error){
                System.out.println(error);
            }

    }
}
