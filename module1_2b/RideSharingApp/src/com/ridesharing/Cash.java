package com.ridesharing;

public class Cash implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made with Cash.");
    }
}
