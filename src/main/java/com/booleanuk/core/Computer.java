package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public PowerSupply psu;
    public Game game;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }
    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.psu = psu;
        this.installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String game) {
        this.game = new Game(game);
        this.installedGames.add(this.game);
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
