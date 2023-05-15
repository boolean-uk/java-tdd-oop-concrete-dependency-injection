package com.booleanuk.core;

import java.util.HashMap;

public class Scores {
    private HashMap<String, Integer> letterScores;

    public Scores() {
        this.letterScores = new HashMap<>();
        this.letterScores.put("A", 1);
        this.letterScores.put("Z", 10);
    }

    public int getScore(String letter) {
        if (letterScores.containsKey(letter)) {
            return letterScores.get(letter);
        }
        return 0;
    }

}
