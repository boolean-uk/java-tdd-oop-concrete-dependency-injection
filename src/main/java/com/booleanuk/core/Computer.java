package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public PowerSupply powerSupply;

    public Computer(PowerSupply powerSupply){
        this.powerSupply = powerSupply;
    }
    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames){
        this.powerSupply = powerSupply;
        this.installedGames = installedGames;
    }
    public void turnOn() {
        powerSupply.turnOn();
    }
    public void installGame(String newGame) {
        Game game = new Game(newGame);
        this.installedGames.add(game);
    }

    public String playGame(String playGame) {
        for (Game g : this.installedGames) {
            if (g.name.equals(playGame)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}