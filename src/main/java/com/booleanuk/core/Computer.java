package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    private PowerSupply psu;
    public Computer(PowerSupply psu){
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }
    public Computer(PowerSupply psu, ArrayList<Game> preInstalled){
        this.installedGames = new ArrayList<>();
        this.installedGames.addAll(preInstalled);
        this.psu = psu;
    }
    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String name) {

        this.installedGames.add(new Game(name));
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
