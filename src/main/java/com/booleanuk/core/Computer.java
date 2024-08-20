package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply psu){
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled){
        this.psu = psu;
        this.installedGames = preInstalled;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String gameName) {
        Game game = new Game(gameName);
        this.installedGames.add(game);
    }

    public String playGame(String game) {
        for (Game g: installedGames){
            if (g.name == game){
                System.out.println(g.start());
                return g.start();
            }
        }
        return "Game not installed";
    }
}
