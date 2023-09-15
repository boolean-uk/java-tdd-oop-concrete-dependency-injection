package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ComputerTest {
    @Test
    public void shouldTurnOn() {
        Computer myPc = new Computer();
        myPc.turnOn();

        Assertions.assertTrue(myPc.getPsu().isOn);
    }

    @Test
    public void shouldInstallGames() {
        Computer myPc = new Computer();

        myPc.installGame("Final Fantasy XI");

        Assertions.assertEquals(1, myPc.installedGames.size());
        Assertions.assertEquals("Final Fantasy XI", myPc.installedGames.get(0).getName());
    }

    @Test
    public void shouldPlayGames() {
        Computer myPc = new Computer();

        myPc.installGame("Duck Game");
        myPc.installGame("Dragon's Dogma: Dark Arisen");

        Assertions.assertEquals("Playing Duck Game", myPc.playGame("Duck Game"));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame("Dragon's Dogma: Dark Arisen"));
        Assertions.assertEquals("Game not installed", myPc.playGame("Morrowind"));
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
        Assertions.assertEquals("Dwarf Fortress", myPc.installedGames.get(0).getName());
        Assertions.assertEquals("Baldur's Gate", myPc.installedGames.get(1).getName());
    }
}
