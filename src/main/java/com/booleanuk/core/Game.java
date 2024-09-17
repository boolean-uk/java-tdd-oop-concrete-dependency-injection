package com.booleanuk.core;

import java.util.ArrayList;

public class Game {


    private String name;

    public Game(String name) {
        this.name = name;
    }

    public String start() {
        return "Playing " + this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
