package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        psu.turnOn();
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

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }
}
