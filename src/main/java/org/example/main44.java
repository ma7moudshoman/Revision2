package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class main44 {
    public static void main(String[]args){


        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=input.nextInt();
        int[]arr=new int[size];
        for (int i=0;i<size;i++) {
            arr[i]=input.nextInt();
        }

        Arrays.sort(arr);

        for (int i=0;i<size;i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
