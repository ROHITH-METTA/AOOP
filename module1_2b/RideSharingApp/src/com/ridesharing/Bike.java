package com.ridesharing;

public class Bike extends Vehicle {
    public Bike() {
        type = "Bike";
    }

    @Override
    public void drive() {
        System.out.println("Riding a bike!");
    }
}
