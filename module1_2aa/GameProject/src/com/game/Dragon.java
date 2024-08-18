package com.game;

public class Dragon extends Enemy {
    public Dragon() {
        type = "Dragon";
    }

    @Override
    public void attack() {
        System.out.println("Dragon breathes fire!");
    }
}
