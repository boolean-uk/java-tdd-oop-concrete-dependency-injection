package com.booleanuk.extension;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }
    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        this.installedGames = preInstalled;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g == game) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
