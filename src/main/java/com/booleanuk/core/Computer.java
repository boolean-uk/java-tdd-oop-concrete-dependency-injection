package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply myPsu;

    public Computer(PowerSupply myPsu) {
        this.myPsu = myPsu;
    }

    public Computer(PowerSupply myPsu, ArrayList<Game> preInstalledGames) {
        this.myPsu = myPsu;
        this.installedGames = preInstalledGames;
    }

    public void turnOn() {
        myPsu.turnOn();
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
