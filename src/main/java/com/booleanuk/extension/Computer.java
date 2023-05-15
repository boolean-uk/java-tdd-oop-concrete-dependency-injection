package com.booleanuk.extension;

import java.util.ArrayList;

public class Computer {
    private final PowerSupply psu;
    private ArrayList<Game> installedGames = new ArrayList<>();

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> games) {
        this.psu = psu;
        this.installedGames = games;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.title().equals(game.title())) {
                return g.start();
            }
        }

        return "Game not installed";
    }

    public int numberOfInstalledGames() {
        return this.installedGames.size();
    }

    public boolean isGameInstalled(Game game) {
        return installedGames.stream()
                .anyMatch(g -> g.title().equals(game.title()));
    }
}
