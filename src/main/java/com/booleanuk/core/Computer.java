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

    public void installGame(String gameName) {
        Game game = new Game(gameName);
        this.installedGames.add(game);
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
