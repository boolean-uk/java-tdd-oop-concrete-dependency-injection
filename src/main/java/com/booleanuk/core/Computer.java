package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply powerSupply;
    private Game game;

    public Computer(){
        this.powerSupply = new PowerSupply();
    }

    public Computer(PowerSupply powerSupply, ArrayList<Game> installedGames){
        this.powerSupply = powerSupply;
        this.installedGames = installedGames;

    }
    public PowerSupply getPowerSupply(){
        return powerSupply;
    }
    public void turnOn() {
        powerSupply.turnOn();
    }
    public void installGame(String newGame) {
        this.game = new Game(newGame);
        this.installedGames.add(game);
    }

    public String playGame(String playGame) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(playGame)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}