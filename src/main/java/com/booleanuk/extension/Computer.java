package com.booleanuk.extension;

import java.awt.font.GlyphMetrics;
import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames ;
    private PowerSupply powerSupply;
    public void turnOn() {
        this.powerSupply.turnOn();
    }
    public Computer(PowerSupply powerSupply){
        this.powerSupply = powerSupply;
        this.installedGames = new ArrayList<>();
    }
    public Computer(PowerSupply powerSupply,ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
        this.powerSupply = powerSupply;
    }
    public Computer() {
        this.installedGames = new ArrayList<>();
    }
    public void installGame(String nameOfGame){
        this.installedGames.add(new Game(nameOfGame));
    }
    public void installGame(Game game){
        this.installedGames.add(game);
    }
    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.getName().equals(game.getName())) {
                return g.start();
            }
        }
        return "Game not installed";
    }
}
