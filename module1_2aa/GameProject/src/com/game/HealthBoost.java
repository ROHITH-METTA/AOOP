package com.game;

public class HealthBoost implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Health boosted!");
    }
}
