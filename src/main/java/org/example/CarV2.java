package org.example;

public class CarV2 implements Movable,SelfDrivable {

    private int x, y;
    private int  numberOFPassenger;
    public  CarV2(){

    }
    @Override
    public void NewMethodd (){

    }
    public CarV2(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNumberOFPassenger() {
        return numberOFPassenger;
    }

    public void setNumberOFPassenger(int numberOFPassenger) {
        this.numberOFPassenger = numberOFPassenger;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void destination(String d) {
        System.out.println("destination = "+ d);
    }

    @Override
    public void drive() {
        System.out.println("drive = 2 " );
    }
}
