package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
        this.psu = psu;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.name.equals(game.name)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
