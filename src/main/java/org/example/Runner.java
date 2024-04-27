package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[]args){

        System.out.println(" Building Stream ");
        Stream<String>stringStream=Stream.empty();
        String[] numbers=new  String[]{"one","two","three","four"};

        Stream<String>stringStreamArray=Stream.of(numbers);
        Stream<String>stringStreamArrayAs= Arrays.stream(numbers);
        Stream<String>stringBuilder=Stream.<String>builder()
                .add("b One")
                .add("B two")
                .add("B three")
                .build();
        stringBuilder.forEach(number -> System.out.println(numbers));
    }
}
