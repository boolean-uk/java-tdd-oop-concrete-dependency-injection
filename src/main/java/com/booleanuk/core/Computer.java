package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String gameName) {
        Game game = new Game(gameName);
        this.installedGames.add(game);
    }

    public String playGame() {
        for (Game g : this.installedGames) {
            if (g.name.equals("Morrowind")) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
