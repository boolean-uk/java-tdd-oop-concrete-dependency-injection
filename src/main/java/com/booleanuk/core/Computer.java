package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames;
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.setInstalledGames(new ArrayList<>());
        this.setPsu(psu);
    }

    public Computer (PowerSupply psu, ArrayList<Game> preInstalled) {
        this(psu);
        this.installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String gameName) {
        this.installedGames.add(new Game(gameName));
    }

    public String playGame(String gameName) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameName)) {
                return g.start();
            }
        }
        return "Game not installed";
    }

    public void setPsu(PowerSupply psu) {
        this.psu = psu;
    }

    public void setInstalledGames(ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
    }

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }
}
