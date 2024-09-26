package com.booleanuk.extension;

public class Game {
    private final String name;

    public Game(String name) {
        this.name = name;
    }

    public String start() {
        return "Playing " + this.name;
    }

    public String title() {
        return this.name;
    }
}
