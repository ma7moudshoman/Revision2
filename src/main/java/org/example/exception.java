package org.example;

import java.io.FilterOutputStream;

public class exception  {

    public static void main(String []args){


       try {
           int[]arr=new int[12];

        arr[13]=67;
        System.out.println(arr[13]);
       }catch (ArrayIndexOutOfBoundsException E) {
           System.out.println(E);
           // System.exit(0);

          // System.out.println("Finally");
       }catch (Exception e){
           System.out.println("rest of the code");

       }






     /*  try {
           int u=8/0;

        System.out.println(u);
           System.out.println(" Rest of the code");
           System.out.println("Rest of the code");
           System.out.println("Rest of the code");

       }
       catch (java.lang.Exception e){
           System.out.println(e);
       }
        System.out.println("Rest of the code");

*/
        /*
try {
    int val=Integer.parseInt("jlhfudtytk");
    System.out.println(val);

}catch (java.lang.Exception e){
    System.out.println("my name is mahmoud");
}*/



/*
try {


    int[] arr = null;

    System.out.println(arr[5]);

for (int d:arr)

    System.out.println(d);
        System.out.println("1");
        System.out.println("5");}
    catch (NullPointerException e) {
        System.out.println(e);
    }*/
        }}
    /*
for (int i = 0;i<arr.length;i++){
            System.out.println(i);
        }*/


