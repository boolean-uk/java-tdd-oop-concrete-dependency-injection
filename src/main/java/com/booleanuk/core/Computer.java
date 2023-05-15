package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    private PowerSupply psu;

    public Computer(PowerSupply psu){
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu, ArrayList<Game> preinstalled){
        this.psu = psu;
        this.installedGames = preinstalled;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        int gameIndex = installedGames.indexOf(game);
            if (gameIndex >= 0) {
                return installedGames.get(gameIndex).start();
            }
        return "Game not installed";
    }
}
