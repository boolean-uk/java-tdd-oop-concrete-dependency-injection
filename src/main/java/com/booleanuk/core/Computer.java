package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames = new ArrayList<>();

    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }
    public Computer(PowerSupply psu,ArrayList<Game> preinstalled) {
        this.psu=psu;
        this.installedGames = preinstalled;
    }

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }

    public void setInstalledGames(ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
    }

    public PowerSupply getPsu() {
        return psu;
    }

    public void setPsu(PowerSupply psu) {
        this.psu = psu;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(Game gameGiven) {
        this.installedGames.add(gameGiven);
    }

    public String playGame(Game gameGiven) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(gameGiven.getName())) {
                return g.start();
            }
        }
        return "Game not installed";
    }
}
