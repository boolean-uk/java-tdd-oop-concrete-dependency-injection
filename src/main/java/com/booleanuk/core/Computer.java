package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames;
    public PowerSupply psu;
    public Game newGame;

    public Computer(PowerSupply psu){
        this.psu = psu;
        installedGames = new ArrayList<>();
    }
    public Computer(PowerSupply psu, ArrayList<Game> preInstalled){
        this.psu = psu;
        this.installedGames = preInstalled;
    }

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(Game game) {
        newGame = game;
        this.installedGames.add(newGame);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(game.getName())) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
