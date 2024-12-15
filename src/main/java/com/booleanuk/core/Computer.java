package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    private ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public ArrayList<Game> getInstalledGames() {
        return installedGames;
    }

    public void setInstalledGames(ArrayList<Game> installedGames) {
        this.installedGames = installedGames;
    }

    public PowerSupply getPsu() {
        return psu;
    }

    public void setPsu(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu){
        setPsu(psu);
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled){
        setPsu(psu);
        setInstalledGames(preInstalled);
    }

    public void turnOn() {
        this.getPsu().turnOn();
    }

    public void installGame(Game game) {
        this.getInstalledGames().add(game);
    }

    public String playGame(String gameName) {
        for (Game g : this.getInstalledGames()) {
            if (g.getName().equals(gameName)) {
                return g.start();
            }
        }
        return "Game not installed";
    }
}
