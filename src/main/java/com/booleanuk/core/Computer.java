package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply myPsu;

    public Computer(PowerSupply myPsu, ArrayList<Game> preInstalled) {
        this.myPsu = myPsu;
        this.installedGames = preInstalled;

    }
    public Computer(PowerSupply myPsu) {
        this.myPsu = myPsu;

    }

    public void turnOn() {

        this.myPsu.turnOn();
    }

    public void installGame(String installGame) {
        Game game = new Game(installGame);
        this.installedGames.add(game);
    }

    public String playGame(String installGame) {
        for (Game g : this.installedGames) {
            if (g.name.equals(installGame)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
