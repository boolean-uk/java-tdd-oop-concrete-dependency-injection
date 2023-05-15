package com.booleanuk.extensions;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames = new ArrayList<>();
    private final PowerSupply psu;

    public Computer(PowerSupply psu){
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalledGames){
        this.psu = psu;
        this.installedGames = preInstalledGames;
    }



    public void turnOn() {
        psu.turnOn();
    }



    public void installGame(Game game) {
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

    public int numberInstalledGames(){
        return installedGames.size();
    }

    public boolean isGameInstalled(Game game){
        return installedGames.stream()
                .anyMatch(g -> g.getName().equals(game.getName()));
    }

    }

