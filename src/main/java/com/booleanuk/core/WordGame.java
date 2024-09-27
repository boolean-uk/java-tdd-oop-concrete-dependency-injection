package com.booleanuk.core;

public class WordGame {
    String targetWord;
    Scores score;

    public WordGame(Scores score) {
        this.score = score;
    }

    public int returnScore() {
        return this.score.getScore("A");
    }

}
