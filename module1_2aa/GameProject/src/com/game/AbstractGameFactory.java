package com.game;

public interface AbstractGameFactory {
    Weapon createWeapon();
    PowerUp createPowerUp();
}
