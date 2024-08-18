package com.game;

public abstract class Enemy {
    protected String type;

    public abstract void attack();

    @Override
    public String toString() {
        return "Enemy Type: " + type;
    }
}
