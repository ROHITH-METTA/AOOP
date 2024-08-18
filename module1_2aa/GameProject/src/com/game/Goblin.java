package com.game;

public class Goblin extends Enemy {
    public Goblin() {
        type = "Goblin";
    }

    @Override
    public void attack() {
        System.out.println("Goblin attacks with a club!");
    }
}
