package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private final PowerSupply powerSupply;
    public ArrayList<Game> installedGames;

    public Computer(PowerSupply psu1) {
        this.powerSupply = psu1;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu1, ArrayList<Game> preInstalledGames) {
        this.powerSupply = psu1;
        this.installedGames = preInstalledGames;
    }

    public void turnOn() {
        powerSupply.turnOn();
    }

    public void installGame(Game game) {
        installedGames.add(game);
    }

    public String playGame(String gameName) {
        for (Game g : installedGames) {
            if (g.name.equals(gameName)) {
                return "Playing " + g.name;
            }
        }
        return "Game not installed";
    }
}
