package org.example;

import java.util.Scanner;

public class Revision {
    public static void main(String[]args){

        stop : for (int i = 1; i <= 5; i++) {

                System.out.println();

                for (int h = 1; h <= 10; h++) {

                    if (h>i)
                        continue stop;
                   /* if (i == 5)
                        break stop;
                    System.out.print(" * ");
*/                System.out.print(" * ");


                }
            System.out.println("hgghghg");

            }


        /*

        for (int i=1;i<=4;i++){
            System.out.println(  "i : " + i);

            for (int j=1;j<=3;j++){
                System.out.print ("Nested loop : " + j + " i " + i + "  / " );
                for (int l=1;l<=2;l++){
                    System.out.print("Nested loop : " +  l + " j " + j );
                }
                System.out.println("");



            }
            System.out.println("");
        }
*/







   // break : causes immediate exit from control Structure
        // continue : Skips remaining Statement in loop body
        // nested loop : it is a loop inside loop
/*

        Scanner input =new Scanner(System.in);
        System.out.println("test yourself");
        System.out.println("what is ' 5+10/2*10 = ? ' ");
        float userAnswer, theCorrectAnswer=55;
        boolean questionAnswer=false;


        for (int i=1;i<=3; i++) {
            System.out.println("Enter your number ");
            userAnswer = input.nextFloat();
            if (userAnswer == theCorrectAnswer) {
                questionAnswer = true;
                break;

            }
            else if (userAnswer != theCorrectAnswer){
                if (i==3)
                    continue;
                System.out.println("ENTER THE OTHER NUMBER :  " + (i + 1 )+ ":");
        }
        }
        if (true)
        System.out.println("the correct answer");
        else
            System.out.println("the wrong answer");
*/


/*

for (int i=1;i<=10; i++){
    if (i<=4){
break;
     }
    System.out.println(" i = " + i);
}
        System.out.println("Hello Mahmoud");
*/



        /*

Scanner input=new Scanner(System.in);

        float n;
        float sum=0;
        for (int i=1 ;i<=10;i++){
            System.out.println("enter the number " + i + ":");
            n=input.nextInt();
            sum+=n;
        }
        System.out.println("avg : "+sum/10);
*/


/*

        Scanner input =new Scanner(System.in);
        float n;
        n=input.nextInt();

        float sum=0;
            for (int i=1 ;i<=n;i++){
            //    System.out.println("enter the number " + i + ":");
                sum+=1.0/i;
            }
        System.out.println("avg : "+sum);
*/


      /*  write a program that inter 10 integer number from the user
        and then the sum of the even and odd integer

        Scanner input=new Scanner(System.in);
        int num;
        int CountEven=0 , CountOdd=0;

        int i=0;

        while ( i<10){
            System.out.println("enter your number");
            num=input.nextInt();
            if (num%2==0)
                CountEven++;
            else
                CountOdd++;
            i++;
        }

        System.out.println("even number" + CountEven);
        System.out.println("odd number" +CountOdd );
*/


        /*write a program that inter 10 integer number from the user
        and then the sum of the even and odd integer

        Scanner input=new Scanner(System.in);


        int num;
        int sumeven=0 , sumodd=0;

        int i=0;

        while ( i<10){
            System.out.println("enter your number");
            num=input.nextInt();
            if (num%2==0)
                sumeven+=num;
            else
                sumodd=+num;
            i++;
        }

        System.out.println("even number" + sumeven);
        System.out.println("odd number" +sumodd );

   >>>>>>>>>>>>>  or  <<<<<<<<<<<<<<<<

        int num;
        int sumeven=0 , sumodd=0;

        for (int i=1;i<=10;i++) {
                        num=input.nextInt();
            if (i % 2 == 0) {
                sumeven += num;
            } else {
                sumodd = +num;
            }
        }
        System.out.println("even number" + sumeven);
        System.out.println("odd number" +sumodd );
*/


/*
 write a program ti find a factorial value of any number   entered through  the user


     Scanner input =new Scanner(System.in);
        System.out.println("Please enter your number");
        int number;
     number=input.nextInt();
     int sum=1;
        for (int i=1; i<=number;i++){
            sum=sum*i;
        }
        System.out.println("the factorial number is = " + sum);
*/



/*
//write a program that Asking the user input a  positive integer
        // it should then print the multiplication table of that
Scanner input=new Scanner(System.in);
int num=0;
        System.out.println("enter your number");
num=input.nextInt();
for ( int i=1;i<=10;i++){
    System.out.println(num+"*"+ i + "="+(num*i));
}*/



        // write a program to calculate the sum of 10 floating number

      /*  Scanner input=new Scanner(System.in);
        float sum =0, num;
        for (int i=0;i<=10;i++){
            System.out.println("Enter your number ");
            num=input.nextFloat();
            num++;
            sum+=num;
        }
        System.out.println("sum of number is : " + sum);
/*
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                    System.out.println("number = " + i);
                    break;
                case 2:
                    System.out.println("number = " + i);
                    break;
                case 3:
                    System.out.println("number = " + i);
                    break;
                case 4:
                    System.out.println("number = " + i);
                    break;
                case 5:
                    System.out.println("number = " + i);
                    break;
                case 6:
                    System.out.println("number = " + i);
                    break;
                case 7:
                    System.out.println("number = " + i);
                    break;
                case 8:
                    System.out.println("number = " + i);
                    break;
                case 9:
                    System.out.println("number = " + i);
                    break;
                case 10:
                    System.out.println("number = " + i);
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        }*/


        /*int i=1;
        do
        {
            System.out.println("the number is =  " + i);
            i++;
        }while (i<=10);
*/

      /*  int num =1;
        while (num<=10){
            System.out.println(num);
               num++;
*/
        /*
        for (int i=1; i<=10;i++){
            System.out.println("number = " + i);
           */
        }



    }


