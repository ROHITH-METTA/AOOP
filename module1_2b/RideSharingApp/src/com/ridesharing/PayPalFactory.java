package com.ridesharing;

public class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}
