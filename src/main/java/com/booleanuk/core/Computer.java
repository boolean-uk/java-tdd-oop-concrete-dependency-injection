package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private final PowerSupply psu;
    private final ArrayList<Game> installedGames;

    public Computer(PowerSupply psu){
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu, ArrayList<Game> installedGames){
        this.psu = psu;
        this.installedGames = installedGames;
    }

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String gameName) {
        Game game = new Game(gameName);
        this.installedGames.add(game);
    }

    public String playGame(String gameName) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(gameName)) {
                return g.start();
            }
        }
        return "Game not installed";
    }
}
