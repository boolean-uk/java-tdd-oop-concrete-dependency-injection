package com.booleanuk.extensions;

import com.booleanuk.extensions.Computer;
import com.booleanuk.extensions.Game;
import com.booleanuk.extensions.PowerSupply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class ExtensionsTest {
    @Test
    public void shouldTurnOn() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);
        myPc.turnOn();

        Assertions.assertTrue(myPsu.isOn());
    }

    @Test
    public void shouldInstallGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);

        Game g = new Game("Final Fantasy XI");
        myPc.installGame(g);

        Assertions.assertEquals(1, myPc.numberInstalledGames());
        Assertions.assertTrue(myPc.isGameInstalled(g));
    }

    @Test
    public void shouldPlayGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);

        Game g = new Game("Duck Game");
        Game g2 = new Game("Dragon's Dogma: Dark Arisen");
        myPc.installGame(g);
        myPc.installGame(g2);

        Assertions.assertEquals("Playing Duck Game", myPc.playGame("Duck Game"));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame("Dragon's Dogma: Dark Arisen"));
        Assertions.assertEquals("Game not installed", myPc.playGame("Morrowind"));
    }

    @Test
    public void canPreinstallGames() {
        PowerSupply myPsu = new PowerSupply();

        Game g1 = new Game("Dwarf Fortress");
        Game g2 = new Game("Baldur's Gate");
        ArrayList<Game> preInstalled = new ArrayList<>(){{
            add(g1);
            add(g2);
        }};

        Computer myPc = new Computer(myPsu, preInstalled);

        Assertions.assertEquals(2, myPc.numberInstalledGames());
        Assertions.assertTrue( myPc.isGameInstalled(g1));
        Assertions.assertTrue( myPc.isGameInstalled(g2));
    }
}

