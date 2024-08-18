package com.ridesharing;

public class Car extends Vehicle {
    public Car() {
        type = "Car";
    }

    @Override
    public void drive() {
        System.out.println("Driving a car!");
    }
}
