package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class Array {

  /*  public static void start(int [] x){
        for (int i=0;i<x.length;i++){
               System.out.print(x[i]);
        }
    }

    static  int []getArray(){
        int []arr={1,2,7,3};
        return arr;
    }*/
    public static void main(String[]args){
                            // 3 >>>>> row
                           // 4 >>>>>> column
        int [] [] array={

                {4,8,9},
                {1,5,6},
                {4,6,9},
                {7,2,3}
        };

        for (int i=0;i<3;i++){
            for (int h=0;h<4;h++){
                System.out.print(array[h][i] + " ");
            }
            System.out.println();
        }

        //      or

        /*
        for (int i=0;i<array[0].length;i++){

            for (int y =0 ; y<array[i].length;y++){

                System.out.print(array[i][y] + " ");
            }
            System.out.println();
        }*/

    //    System.out.println(array[2].length);


     /*   array[0][0]=55;
        array[0][1]=99;
        array[0][2]=59;
        array[0][3]=33;

        array[1][0]=54;
        array[1][1]=98;
        array[1][2]=56;
        array[1][3]=34;


        array[2][0]=51;
        array[2][1]=93;
        array[2][2]=57;
        array[2][3]=39;
*/



   //*****************************************************



/*
        int arr1[]={1,2,3};
        int[]arr2={30,40,50};
        int[]arr3={60,70,80};

        arr1=arr2=arr3;
        arr1[0]=0;
       // for (int i=0;i<arr2.length;i++){
            System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);
*/





   /* int []arr={1,2,3,4,5,6,7};
        int []arr2={1,2,3,4,5,6,7};
        int []h=new int[]{1,2,3,5,8,9};
//for (int i=0;i<h.length;i++)

//start(arr);
//start(arr2);*/
/*
int arr[]=getArray();
        System.out.println(arr[1]);
*/


// *************************************************


        /*Scanner input=new Scanner(System.in);
        char []arr= new char[]{'d','a','r','w','c','q','s'};
         String str=new String(arr,2,5);
         System.out.println(str);
*/
//  *********************************************************


      /*  for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);*/

            // System.out.print(arr);
//*****************************************************************

        /*

        int []arr={2,5,8,9,10,4,8,0,7};
 Arrays.sort(arr);
 for (int i=0;i<arr.length;i++){
     System.out.print(arr[i] + " ");
 }
*/

//***********************************************************************

        /*  int []arr={2,5,8,9,10,4,8,0,7};
        int max=arr[0];
        int min=arr[0];

        for (int i=1;i<arr.length;i++){

            if (arr[i]<min)
                min=arr[i];
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
*/
        //*****************************************************************


      /*  int []arr={1,5,8,9,10,4,8,6,7};
        int num=10;
        boolean f=false;
        for (int i=0;i<arr.length;i++){

            if (arr[i]==num){
               f=true;
                break;
            }
        }
        if (f){
            System.out.println("found ");
        }
        else
            System.out.println("not found ");
*/
//*************************************************************************

        /*

        Scanner input =new Scanner(System.in);

        int[]mahmoud= new int[5];
        int sum=0;
        double avg=1;
        for (int i=0;i<mahmoud.length;i++)
        {
            System.out.println("enter your number : ");
            mahmoud[i]=input.nextInt();
            sum+=mahmoud[i];
            avg=sum/mahmoud.length;

        }
        System.out.println("sum : " +sum);
        System.out.println("average : " + avg);
*/
//   *************************************************************


       /* mahmoud[0]=15;
        mahmoud[1]=10;
        mahmoud[2]=11;
        mahmoud[3]=12;
        mahmoud[4]=13;
        mahmoud[5]=14;
        mahmoud[6]=15;
        mahmoud[7]=16;*/
       //  System.out.println( mahmoud[4]);
        // System.out.println(mahmoud[1]);
        //  System.out.println(mahmoud[2]);

           /* for (String i : mahmoud){
                System.out.println(i);
            }*/

        /*try {
            mahmoud[8]=17;
            System.out.println("Result: "+ mahmoud[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An error "+e.getMessage());
        }*/
    }
}
