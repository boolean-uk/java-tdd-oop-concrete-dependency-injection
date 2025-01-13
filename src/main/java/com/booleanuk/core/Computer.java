package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public List<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, List<Game> preInstalled) {
        this.psu = psu;
        this.installedGames = preInstalled;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
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
