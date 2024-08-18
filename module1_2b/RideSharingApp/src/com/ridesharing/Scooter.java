package com.ridesharing;

public class Scooter extends Vehicle {
    public Scooter() {
        type = "Scooter";
    }

    @Override
    public void drive() {
        System.out.println("Riding a scooter!");
    }
}
