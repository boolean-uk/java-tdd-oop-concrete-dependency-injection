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

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
