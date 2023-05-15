package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();

    public PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }
    public Computer(PowerSupply psu,ArrayList<Game> preinstalled) {
        this.psu=psu;
        this.installedGames = preinstalled;
    }

    public void turnOn() {
        //PowerSupply psu = new PowerSupply();
        psu.turnOn();
    }

    public void installGame(String stringGame) {
        Game game = new Game(stringGame);
        this.installedGames.add(game);
    }

    public String playGame(String stringGame) {
        for (Game g : this.installedGames) {
            if (g.name.equals(stringGame)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
