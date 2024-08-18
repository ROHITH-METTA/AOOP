package com.ridesharing;

public class CashFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new Cash();
    }
}
