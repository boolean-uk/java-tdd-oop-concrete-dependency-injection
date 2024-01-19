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

        Game game = new Game("Final Fantasy XI");
        myPc.installGame(game);

        Assertions.assertEquals(1, myPc.installedGames.size());
        Assertions.assertEquals(game, myPc.installedGames.get(0));
    }

    @Test
    public void shouldPlayGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);
        Game duckGame = new Game("Duck Game");
        Game dragonsDogmaGame = new Game("Dragon's Dogma: Dark Arisen");
        myPc.installGame(duckGame);

        myPc.installGame(dragonsDogmaGame);

        Assertions.assertEquals("Playing Duck Game", myPc.playGame(duckGame));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame(dragonsDogmaGame));
        Assertions.assertEquals("Game not installed", myPc.playGame(new Game("Morrowind")));
    }

    @Test
    public void canPreinstallGames() {
        PowerSupply myPsu = new PowerSupply();
        Game dwarfFortress = new Game("Dwarf Fortress");
        Game baldursGate = new Game("Baldur's Gate");
        ArrayList<Game> preInstalled = new ArrayList<>(){{
            add(dwarfFortress);
            add(baldursGate);
        }};

        Computer myPc = new Computer(myPsu, preInstalled);

        Assertions.assertEquals(2, myPc.installedGames.size());
        Assertions.assertEquals(dwarfFortress, myPc.installedGames.get(0));
        Assertions.assertEquals(baldursGate, myPc.installedGames.get(1));
    }
}
