package org.example;

public class JavaOOP {

    public static void main(String[]args) {


Product product=new Product("no namse" , "ni",1.5f,15,15.6f,"trfyt");
product.setQuantity(485);
Product p5=new Product();
product.setColor("red");
System.out.println(product);
       // System.out.println(product);
Product k=new Product(product);
k.setColor("red");
        System.out.println(k);
        /*
Circle c1=new Circle();
c1.setRadius(3);
c1.setColor("Black");
        System.out.println( "c1 Area : " + c1.getArea());
        System.out.println("c1 Circumfeence : " + c1.getCircumfeence());
Circle c2=new Circle();
c2.setRadius(2);
c2.setColor("Blue");

        System.out.println("c2 Area : " + c2.getArea());
        System.out.println("c2 Circumfeence : "+ c2.getCircumfeence());
  */  }

    }
