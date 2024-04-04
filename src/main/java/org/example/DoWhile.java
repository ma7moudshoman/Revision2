package org.example;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
/*

        int s=1;
        do {
            System.out.println("java = " + s);
            s++;
        }while (s==-1 );
*/
       /* char letter;
        int counter=0;
        System.out.println("Please enter your letter");
        do {
            letter=input.next().charAt(0);
            if (letter!='d')
            counter++;
        }while (letter!='d');

        System.out.println("counter = " + counter);
*/

        int x, y;
        char c;
        do {
            System.out.println("please enter your number 1");
            x = input.nextInt();
            System.out.println("please enter your number 2");
            y = input.nextInt();

            System.out.println("please Enter one of these operation");
            System.out.println("(*) -> multiply");
            System.out.println("(-) ->  Subtraction");
            System.out.println("(/) -> division");
            System.out.println("(%) -> remainder");
            System.out.println("or press any other key");

            c = input.next().charAt(0);

            switch (c) {
                case '*':
                    System.out.println("result = " + (x * y));
                    break;
                case '/':
                    System.out.println("result = " + (x / y));
                    break;
                case '-':
                    System.out.println("result = " + (x - y));
                    break;
                case '%':
                    System.out.println("result = " + (x % y));
                    break;
            }


        }  while (c == '*' || c=='-'|| c=='/'||c=='%') ;
        System.out.println("invalid code");





    }
}
