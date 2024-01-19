package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply myPsu) {
        this.psu = myPsu;
    }

    public Computer(PowerSupply myPsu, ArrayList<Game> preInstalled) {
        setInstalledGames(preInstalled);
        this.psu = myPsu;
    }
    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(game.getName())) {
                return g.start();
            }
        }

        return "Game not installed";
    }

    public ArrayList<Game> getInstalledGames() {
        return this.installedGames;
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
}
