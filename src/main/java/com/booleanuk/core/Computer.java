package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply psu;
    Game game;
    ArrayList<Game> preInstalled;
    public Computer(PowerSupply psu) {
        this.psu = psu;
    }
    public Computer(PowerSupply plu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        this.preInstalled = preInstalled;
        installedGames.addAll(this.preInstalled);
    }
    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String name) {
        this.game = new Game(name);
        this.installedGames.add(game);
    }


    public String playGame(String name) {
        for (Game g : this.installedGames) {
            if (g.name.equals(name)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
