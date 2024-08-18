package com.ridesharing;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment made with Credit Card.");
    }
}
