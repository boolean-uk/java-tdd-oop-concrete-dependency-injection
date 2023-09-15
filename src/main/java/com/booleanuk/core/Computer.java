package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private  ArrayList<Game> installedGames;
    private PowerSupply psu;

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

    public Computer(PowerSupply psu) {
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu,ArrayList<Game> installedGames ) {
        this.installedGames = installedGames;
        this.psu = psu;
    }

    public void turnOn() {

        this.psu.turnOn();
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
