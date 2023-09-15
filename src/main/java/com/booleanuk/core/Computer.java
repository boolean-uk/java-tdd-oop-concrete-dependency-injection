package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply powerSupply;

    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames) {
        this.powerSupply = powerSupply;
        this.installedGames = installedGames;
    }
    public Computer(PowerSupply myPsu) {
        this.powerSupply = myPsu;
    }
    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }

    public void turnOn() {
        powerSupply.turnOn();
    }

    public void installGame(String game) {
        Game thisgame = new Game(game);
        this.installedGames.add(thisgame);
    }

    public String playGame(String game) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
