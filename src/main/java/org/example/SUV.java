package org.example;

public class SUV extends Car{
    public SUV() {
    }

    public SUV(float height, float weight, int numberOfWheels) {
        super(height, weight, numberOfWheels);
    }
    void m(){
        System.out.println("M");
    }

    @Override
    void autoPilote() {
        System.out.println("SUV autoPilote");
    }


    @Override
    void StreamingService() {
        System.out.println("SUV StreamingService");
    }

    @Override
    void parkingSensors() {
        System.out.println("SUV parkingSensors");
    }
    }
