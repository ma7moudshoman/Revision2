package org.example;

public class Validate  {

            //          throw
    static void validate(int num) {


        if (num <= 0) {
            // System.out.println("this number must be greater than zero");
           MyException arr= new MyException("this number must be greater than zero");
            throw arr;
        } else {
            System.out.println("this number has been entered");
        }
       /* if (num <= 0) {
        // System.out.println("this number must be greater than zero");
        ArithmeticException arr= new ArithmeticException();
       throw arr;
        } else {
            System.out.println("this number has been entered");
        }*/
    }
    /*                ## throws
    static void validate(int num) throws ArithmeticException {
        if (num <= 0) {
        // System.out.println("this number must be greater than zero");
        FileNotFoundException arr= new FileNotFoundException("this number must be greater than zero");
       throw arr;
        } else {
            System.out.println("this number has been entered");
        }
    }
     public static void main(String[]args){

                 try {
                     validate(-5);
                 }catch (FileNotFoundException ddd){
                     System.out.println(ddd);
                 }*/



    public static void main(String[]args){

                 try {
                     validate(-5);
                 }catch (MyException aw){
                   aw.printStackTrace();
                 }
    }
}
