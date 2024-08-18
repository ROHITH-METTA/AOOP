package com.ridesharing;

public class RideSharingTest {
    public static void main(String[] args) {
        // Test Singleton UserAuth
        UserAuth userAuth = UserAuth.getInstance();
        userAuth.logIn();
        
        // Test Factory Method for Vehicles
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();

        VehicleFactory scooterFactory = new ScooterFactory();
        Vehicle scooter = scooterFactory.createVehicle();
        scooter.drive();

        // Test Abstract Factory for Payment Methods
        PaymentFactory creditCardFactory = new CreditCardFactory();
        PaymentMethod creditCard = creditCardFactory.createPaymentMethod();
        creditCard.pay();

        PaymentFactory paypalFactory = new PayPalFactory();
        PaymentMethod paypal = paypalFactory.createPaymentMethod();
        paypal.pay();

        PaymentFactory cashFactory = new CashFactory();
        PaymentMethod cash = cashFactory.createPaymentMethod();
        cash.pay();

        userAuth.logOut();
    }
}
