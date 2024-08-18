package com.game;

public class MedievalGameFactory implements AbstractGameFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthBoost();
    }
}
