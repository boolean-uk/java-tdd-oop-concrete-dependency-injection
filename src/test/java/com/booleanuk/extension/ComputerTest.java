package com.booleanuk.extension;

import com.booleanuk.extension.Computer;
import com.booleanuk.extension.Game;
import com.booleanuk.extension.PowerSupply;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ComputerTest {
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

        Assertions.assertEquals(1, myPc.numberOfInstalledGames());
        Assertions.assertTrue(myPc.isGameInstalled(g));
    }

    @Test
    public void shouldPlayGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);

        myPc.installGame(new Game("Duck Game"));
        myPc.installGame(new Game("Dragon's Dogma: Dark Arisen"));

        Assertions.assertEquals("Playing Duck Game", myPc.playGame(new Game("Duck Game")));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame(new Game("Dragon's Dogma: Dark Arisen")));
        Assertions.assertEquals("Game not installed", myPc.playGame(new Game("Morrowind")));
    }

    @Test
    public void canPreinstallGames() {
        Game g1 = new Game("Dwarf Fortress");
        Game g2 = new Game("Baldur's Gate");

        Computer myPc = new Computer(
                new PowerSupply(),
                new ArrayList<>(){{
                    add(g1);
                    add(g2);
                }}
        );

        Assertions.assertEquals(2, myPc.numberOfInstalledGames());
        Assertions.assertTrue(myPc.isGameInstalled(g1));
        Assertions.assertTrue(myPc.isGameInstalled(g2));
    }
}
