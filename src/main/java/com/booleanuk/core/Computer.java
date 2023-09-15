package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer() {}

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer( PowerSupply psu, ArrayList<Game> installedGames) {
        this.psu = psu;
        this.installedGames.addAll(installedGames);
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(Game newGame) {
        this.installedGames.add(newGame);
    }

    public String playGame(String game) {
        for (Game g : this.installedGames) {
            if (g.name.equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}


