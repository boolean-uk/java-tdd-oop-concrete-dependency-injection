package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply myPsu) {
        this.psu = myPsu;
    }

    public Computer(PowerSupply myPsu, ArrayList<Game> preInstalled) {
        this.installedGames.addAll(preInstalled);
        this.psu = myPsu;
    }
    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String gameTitle) {
        Game game = new Game(gameTitle);
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
