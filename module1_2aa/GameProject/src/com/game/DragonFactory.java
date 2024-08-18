package com.game;

public class DragonFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Dragon();
    }
}
