package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String title) {
        this.installedGames.add(new Game(title));
    }

    public String playGame(String title) {
        for (Game g : this.installedGames) {
            if (g.name.equals(title)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
