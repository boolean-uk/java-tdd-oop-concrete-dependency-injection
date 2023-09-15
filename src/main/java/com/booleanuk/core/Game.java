package com.booleanuk.core;

public class Game {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public String start() {
        return "Playing " + this.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
