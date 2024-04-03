package org.example;

import java.util.Scanner;

public class While {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);

float sum=0;
float grade=0;
int result=1;
while (grade!=-1){

    System.out.println("enter your grade " + result);
     grade=input.nextFloat();
     if (grade!=-1) {
         sum += grade;
         result++;
     }
}
        System.out.println("avg = " + sum/result);
       /* char letter='a';
        boolean flag=true;
        int d=0;
        while (flag)
        {
            letter=input.next().charAt(0);
            d++;
            if (letter=='k')
                flag=false;
        }
        System.out.println("invalid "+ d);
*/



    }
}
