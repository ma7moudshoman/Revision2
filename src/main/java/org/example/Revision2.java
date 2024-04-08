package org.example;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.*;

public class Revision2 {

    // لو عاوز اجيب الارقام الموجوده بين رقمين

    static int sum(int n1 ,int n2) { // 4 6
        if (n1 == n2)
            return n1;
        else {
            if (n1 < n2)
                return n1 + sum(n1 + 1, n2); //3 4 5 6 7 8 9
             else
                return n1 + sum(n1 - 1, n2); //3 4 5 6 7 8 9

        }
    }
    public static void main(String[]args){

        System.out.println(sum(6,3));
    }






    /*

  static   int n1 =0,n2=1 ,n3 ;
static void  print(int n){
    if(n>0){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print( "  " + n3 );
        print(n-1);
    }

}

    public static void main(String[]args) {

int num =5;

        System.out.print(n1+ " " +n2  );

print(num-2 );
}
*/



   /*  Recursion methods
       fibonacci series

     0 1 2 3 4 5 6 7 8 9 10 ....etc

     0 1 1 2 3 5 8 13 21 34 55 .... etc


static int fact (int n) {
if (n==0||n==1)
    return n;
    else
        return fact(n-1)+fact(n-2);

}
    public static void main(String[]args){

        System.out.println( "fact  : " + fact(4 ));
*/


      //  System.out.println(avreg(10,15,16,17,19,10));
        /*

          Scanner input =new Scanner(System.in);
//        void s=fun(5,10);
         fun(10,8);
*/

//        s+=2;

     //   System.out.println( "sum is  : " + );
       // System.out.println( "sum is  : " + s);


       /* Scanner input =new Scanner(System.in);

        System.out.println("enter your number");

        int m , k;
        m=input.nextInt();

        k=input.nextInt();

        int sum=m*k;

        System.out.println(sum);*/
    }

