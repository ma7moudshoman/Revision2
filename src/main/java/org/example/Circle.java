package org.example;

public class Circle {
    private double radius;
    private  String color;

    public void setRadius( double  r){
       this.radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String C){
       this.color=C;
    }
    public String getColor(){
        return color;
    }
    public float getArea(){
        return (float) (Math.PI *radius*radius);
    }
public  double getCircumfeence(){
        return Math.PI *2*radius;
}

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
