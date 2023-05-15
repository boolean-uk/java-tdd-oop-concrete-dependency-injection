package com.booleanuk.core;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    public PowerSupply psu;

    public Computer(PowerSupply psu){
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled){
        this.psu = psu;
        this.installedGames = preInstalled;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String gameName) {
        Game game = new Game(gameName);
        this.installedGames.add(game);
    }

    public String playGame(String gameName) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameName)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
