package com.booleanuk.core;

public class Game {
    private final String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String start() {
        return "Playing " + this.name;
    }
}
