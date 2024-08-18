package com.game;

public class GameTest {
    public static void main(String[] args) {
        // Test Singleton GameState
        GameState gameState = GameState.getInstance();
        gameState.printState();
        
        // Test Factory Method for Enemies
        EnemyFactory goblinFactory = new GoblinFactory();
        Enemy goblin = goblinFactory.createEnemy();
        goblin.attack();

        EnemyFactory dragonFactory = new DragonFactory();
        Enemy dragon = dragonFactory.createEnemy();
        dragon.attack();

        // Test Abstract Factory for Weapons and Power-ups
        AbstractGameFactory medievalFactory = new MedievalGameFactory();
        Weapon medievalWeapon = medievalFactory.createWeapon();
        PowerUp medievalPowerUp = medievalFactory.createPowerUp();
        medievalWeapon.use();
        medievalPowerUp.activate();

        AbstractGameFactory futuristicFactory = new FuturisticGameFactory();
        Weapon futuristicWeapon = futuristicFactory.createWeapon();
        PowerUp futuristicPowerUp = futuristicFactory.createPowerUp();
        futuristicWeapon.use();
        futuristicPowerUp.activate();
    }
}
