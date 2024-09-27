package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    private PowerSupply powerSupply;

    public Computer(PowerSupply ps) {
        this.powerSupply = ps;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply ps, ArrayList<Game> preInstalled) {
        this.powerSupply = ps;
        this.installedGames = preInstalled;
    }

    public void turnOn() {
        this.powerSupply.turnOn();
    }

    public void installGame(String gameName) {
        this.installedGames.add(new Game(gameName));
    }

    public String playGame(String gameName) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameName)) {
                return g.start();
            }
        }
        return "Game not installed";
    }
}
