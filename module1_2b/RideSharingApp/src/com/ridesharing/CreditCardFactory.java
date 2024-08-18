package com.ridesharing;

public class CreditCardFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}
