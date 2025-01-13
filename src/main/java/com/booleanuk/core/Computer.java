package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public PowerSupply powerSupply;

    public Computer(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames) {
        this.powerSupply = powerSupply;
        this.installedGames =  installedGames;
    }

    public void turnOn() {
        powerSupply.turnOn();
    }

    public void installGame(Game game) {
        installedGames.add(game);
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
