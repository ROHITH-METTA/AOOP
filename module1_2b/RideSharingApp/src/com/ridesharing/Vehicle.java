package com.ridesharing;

public abstract class Vehicle {
    protected String type;

    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle Type: " + type;
    }
}
