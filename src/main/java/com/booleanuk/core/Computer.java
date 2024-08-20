package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    private PowerSupply powerSupply;
    public Computer(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames) {
        this.powerSupply = powerSupply;
        this.installedGames = installedGames;
    }
    public void turnOn() {
        powerSupply.turnOn();
    }

    public void installGame(String gameName) {
        Game game = new Game(gameName);
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
