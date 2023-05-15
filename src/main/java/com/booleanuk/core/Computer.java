package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    private PowerSupply psu;

    public Computer(PowerSupply psu){
        this.psu = psu;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply psu, ArrayList<Game> preinstalled){
        this.psu = psu;
        this.installedGames = preinstalled;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String gameTitle) {
        Game game = new Game(gameTitle);
        this.installedGames.add(game);
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
