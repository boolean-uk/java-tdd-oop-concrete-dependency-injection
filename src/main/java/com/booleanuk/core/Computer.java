package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply powerSupply;

    public Computer(PowerSupply powerSupply) {
        this.powerSupply=powerSupply;

    }
    public Computer(PowerSupply powerSupply, ArrayList<Game> games) {
        this.powerSupply=powerSupply;
        this.installedGames =  games;


    }

    public void turnOn() {
        powerSupply.turnOn();
    }

    public void installGame(String gameToInstall) {
        Game game = new Game(gameToInstall);
        this.installedGames.add(game);
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
