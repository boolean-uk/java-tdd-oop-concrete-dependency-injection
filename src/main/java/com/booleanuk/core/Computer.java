package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    PowerSupply psu;

    public Computer(PowerSupply powerSupply){
        this.psu = powerSupply;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply powerSupply, ArrayList<Game> list){
        this.installedGames = list;
        this.psu = powerSupply;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String gameTitle) {
        this.installedGames.add(new Game(gameTitle));
    }

    public String playGame(String gameTitle) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameTitle)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
