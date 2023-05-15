package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;// = new ArrayList<>();
    PowerSupply psu;// = new PowerSupply();

    public Computer(PowerSupply psu) {
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }
    public Computer(PowerSupply psu, ArrayList<Game> preinstalledGames) {
        this.psu = psu;
        this.installedGames = preinstalledGames;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String name) {
        Game game = new Game(name);
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
