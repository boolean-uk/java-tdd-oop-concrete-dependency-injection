package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public PowerSupply psu;

    // Constructor without preinstalled games
    public Computer(PowerSupply psu){
        this.psu = psu;
    }

    // Constructor with preinstalled games
    public Computer(PowerSupply psu, ArrayList<Game> preInstalledGames){
        this.psu = psu;
        this.installedGames = preInstalledGames;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(Game newGame) {
        this.installedGames.add(newGame);
    }

    public String playGame(Game gameToPlay) {
        if(this.installedGames.contains(gameToPlay)){
            return gameToPlay.start();
        }

        return "Game not installed";
    }
}
