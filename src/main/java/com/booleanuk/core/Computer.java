package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    PowerSupply powerSupply;
    public ArrayList<Game> installedGames = new ArrayList<>();

    public Computer(PowerSupply powerSupply){
        this.powerSupply=powerSupply;
    }
    public Computer(PowerSupply powerSupply, ArrayList<Game> preInstalled){
        installedGames= preInstalled;
    }

    public void turnOn() {
        powerSupply.turnOn();
    }

    public void installGame(String gameTitel) {
        Game game = new Game(gameTitel);
        this.installedGames.add(game);
    }

    public String playGame(String gameTitle) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameTitle)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
