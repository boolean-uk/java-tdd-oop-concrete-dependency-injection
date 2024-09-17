package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply powerSupply;

    public Computer(PowerSupply powerSupply) {
        this.installedGames = new ArrayList<>();
        this.powerSupply = powerSupply;
    }
    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
        this.powerSupply = powerSupply;
    }


    public void turnOn() {
        this.powerSupply.turnOn();
    }

    public void installGame(String theGame) {
        Game game = new Game(theGame);
        this.installedGames.add(game);
    }

    public String playGame(String theGame) {
        for(Game game : this.installedGames) {
            if (game.name.equals(theGame)) {
                return game.start();
            }
        }
        return "Game not installed";
    }
}
