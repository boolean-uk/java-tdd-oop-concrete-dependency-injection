package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ComputerTest {
    @Test
    public void shouldTurnOn() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);
        myPc.turnOn();

        Assertions.assertTrue(myPsu.isOn);
    }

    @Test
    public void shouldInstallGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);
        Game finalFantasyXi = new Game("Final Fantasy XI");

        myPc.installGame(finalFantasyXi);

        Assertions.assertEquals(1, myPc.installedGames.size());
        Assertions.assertEquals("Final Fantasy XI", myPc.installedGames.get(0).name);
    }

    @Test
    public void shouldPlayGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);
        Game duckGame = new Game("Duck Game");
        Game dragonsDogma = new Game("Dragon's Dogma: Dark Arisen");
        Game morroWind = new Game("Morrwind");

        myPc.installGame(duckGame);
        myPc.installGame(dragonsDogma);

        Assertions.assertEquals("Playing Duck Game", myPc.playGame(duckGame));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame(dragonsDogma));
        Assertions.assertEquals("Game not installed", myPc.playGame(morroWind));
    }

    @Test
    public void canPreinstallGames() {
        PowerSupply myPsu = new PowerSupply();
        ArrayList<Game> preInstalled = new ArrayList<>(){{
            add(new Game("Dwarf Fortress"));
            add(new Game("Baldur's Gate"));
        }};

        Computer myPc = new Computer(myPsu, preInstalled);

        Assertions.assertEquals(2, myPc.installedGames.size());
        Assertions.assertEquals("Dwarf Fortress", myPc.installedGames.get(0).name);
        Assertions.assertEquals("Baldur's Gate", myPc.installedGames.get(1).name);
    }
}
