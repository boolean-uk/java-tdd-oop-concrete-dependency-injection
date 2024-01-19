package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply powerSupply;

    public Computer(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Computer(PowerSupply powerSupply, ArrayList<Game> preInstalled) {
        this.powerSupply = powerSupply;
        installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        this.powerSupply.turnOn();
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
