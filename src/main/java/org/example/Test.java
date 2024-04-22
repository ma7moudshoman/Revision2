package org.example;

public class Test {
    public static void main(String[]args){

      Employee e=new Employee("mahmoud","mshpma@1556.com","aman","cairo",1500);
        System.out.println(e.getSalary());

        SalariedDeveloper salariedDeveloper=new SalariedDeveloper("mahmoud","mshpma@1556.com","aman","cairo",1000,200);


        System.out.println(salariedDeveloper.getSalary());

        DailyDeveloper developer=new DailyDeveloper("mahmoud","mshpma@1556.com","aman","cairo",1500,400,10);

      System.out.println(developer.getSalary());




        }
}