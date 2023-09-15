package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;
    private Game game;

    public Computer() {
        this.psu = new PowerSupply();
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalledList){
        this.psu = psu;
        this.installedGames = preInstalledList;
    }
    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String name) {
        this.game = new Game(name);
        this.installedGames.add(game);
    }

    public String playGame(String name) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(name)) {
                return g.start();
            }
        }

        return "Game not installed";
    }

    public PowerSupply getPsu() {
        return psu;
    }
}
