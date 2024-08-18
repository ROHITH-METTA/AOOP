package com.auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String item;

    public Auction(String item) {
        this.item = item;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void startAuction() {
        notifyObservers("Auction for item " + item + " has started.");
    }

    public void endAuction() {
        notifyObservers("Auction for item " + item + " has ended.");
    }
}
