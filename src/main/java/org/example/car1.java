package org.example;

public class car1 <T>implements GenericInterface{

    @Override
    public T carModel() {
        return (T) new CarV1();
    }
}
