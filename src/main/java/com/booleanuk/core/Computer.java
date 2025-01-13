package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String game) {
        for(Game g : installedGames) {
            if(g.name.equals(game)) {
                System.out.println("Game is already installed.");
                return;
            }
        }
        this.installedGames.add(new Game(game));
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
