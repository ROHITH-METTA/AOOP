package com.game;

public class FuturisticGameFactory implements AbstractGameFactory {
    @Override
    public Weapon createWeapon() {
        return new Shield();
    }

    @Override
    public PowerUp createPowerUp() {
        return new SpeedBoost();
    }
}
