package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public Game game;
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

    public void installGame(String gameName) {
        game = new Game(gameName);
        installedGames.add(game);
        String test = "testM";
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
