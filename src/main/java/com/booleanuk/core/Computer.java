package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private PowerSupply psu;
    private ArrayList<Game> installedGames = new ArrayList<>();

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        this.installedGames = preInstalled;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String name) {
        this.installedGames.add(new Game(name));
    }

    public String playGame(String name) {
        for (Game g : this.installedGames) {
            if (g.name.equals(name)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
    public int getNumberOfInstalledGames() {
        return this.installedGames.size();
    }
    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }
}
