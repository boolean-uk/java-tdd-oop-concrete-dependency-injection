package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.setPsu(psu);
    }

    public Computer (PowerSupply psu, ArrayList<Game> preInstalled) {
        this.setPsu(psu);
        this.installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        //PowerSupply psu = new PowerSupply();
        this.psu.turnOn();
    }

    public void installGame(String gameName) {
        //Game game = new Game(gameName);
        this.installedGames.add(new Game(gameName));
    }

    public String playGame(String gameName) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameName)) {
                return g.start();
            }
        }
        return "Game not installed";
    }

    public void setPsu(PowerSupply psu) {
        this.psu = psu;
    }
}
