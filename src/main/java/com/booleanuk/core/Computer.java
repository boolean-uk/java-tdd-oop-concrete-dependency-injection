package com.booleanuk.core;

import java.awt.font.GlyphMetrics;
import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply powerSupply;
    public void turnOn() {
        this.powerSupply.turnOn();
    }
    public Computer(PowerSupply powerSupply){
        this.powerSupply = powerSupply;
    }

    public Computer(PowerSupply powerSupply,ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
        this.powerSupply = powerSupply;
    }

    public Computer() {
    }

    public void installGame() {
        Game game = new Game("Morrowind");
        this.installedGames.add(game);
    }
    public void installGame(String nameOfGame){
        this.installedGames.add(new Game(nameOfGame));
    }
    public void installGame(Game game){
        this.installedGames.add(game);
    }
    public String playGame() {
        for (Game g : this.installedGames) {
            if (g.name.equals("Morrowind")) {
                return g.start();
            }
        }

        return "Game not installed";
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
