package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
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

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String game) {
        newGame = new Game(game);
        this.installedGames.add(newGame);
    }

    public String playGame(String game) {
        for (Game g : this.installedGames) {
            if (g.name.equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
