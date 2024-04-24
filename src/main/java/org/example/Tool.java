package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tool {
    public static void main(String[]args){

       // ArrayList <Integer> list=new ArrayList();
        ArrayList <Integer> list=new ArrayList(); // 10
list.add(10);
list.add(20);
list.add(40);
list.add(list.size(), 16  );
        ArrayList <Integer> list2=new ArrayList(); // 10
        list2.add(13);
         list2.addAll(Arrays.asList(33,44,12,75));
        System.out.println(list2 );
        for ( int i=0 ; i< list.size();i++){
            System.out.println(list.get(i));

        }
      //  System.out.println(list.get(i));

       /* for (Integer num : list){
            System.out.println(num);
        }*/



    }
}
