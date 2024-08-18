package com.game;

public class GameState {
    private static GameState instance;
    private String level;
    private boolean isPaused;

    private GameState() {
        level = "Level 1";
        isPaused = false;
    }

    public static synchronized GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }

    public void printState() {
        System.out.println("Current Level: " + level);
        System.out.println("Game Paused: " + isPaused);
    }
}
