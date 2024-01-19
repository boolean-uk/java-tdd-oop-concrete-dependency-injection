package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalledGames) {
        this.psu = psu;
        this.installedGames.addAll(preInstalledGames);
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String newGame) {
        this.installedGames.add(new Game(newGame));
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
