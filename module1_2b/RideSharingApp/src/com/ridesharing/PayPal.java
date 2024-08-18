package com.ridesharing;

public class PayPal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made with PayPal.");
    }
}
