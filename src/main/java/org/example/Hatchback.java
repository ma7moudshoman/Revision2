package org.example;

public class Hatchback extends Car {
    @Override
    void autoPilote() {
        System.out.println("Hatchback autoPilote");
    }


    @Override
    void StreamingService() {
        System.out.println("Hatchback StreamingService");
    }

    @Override
    void parkingSensors() {
        System.out.println("Hatchback parkingSensors");

    }
}
