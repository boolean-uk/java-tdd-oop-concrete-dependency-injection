package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private final PowerSupply powerSupply;
    public ArrayList<Game> installedGames = new ArrayList<>();

    public Computer(PowerSupply psu1) {
        this.powerSupply = psu1;
    }

    public Computer(PowerSupply psu1, ArrayList<Game> preInstalledGames) {
        this.powerSupply = psu1;
        this.installedGames.addAll(preInstalledGames);
    }

    public void turnOn() {
        powerSupply.turnOn();
    }

    public void installGame(String gameName) {
        Game game = new Game(gameName);
        installedGames.add(game);
    }

    public String playGame(String gameName) {
        for (Game g : installedGames) {
            if (g.name.equals(gameName)) {
                return g.start();
            }
        }
        return "Game not installed";
    }
}
