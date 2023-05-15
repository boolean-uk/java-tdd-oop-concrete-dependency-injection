package com.booleanuk.extension;
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
        Game myGame = new Game("Final Fantasy XI");

        myPc.installGame(myGame);

        Assertions.assertEquals(1, myPc.installedGames.size());
        Assertions.assertEquals("Final Fantasy XI", myPc.installedGames.get(0).name);
    }

    @Test
    public void shouldPlayGames() {
        PowerSupply myPsu = new PowerSupply();
        Computer myPc = new Computer(myPsu);
        Game myGame1 = new Game("Duck Game");
        Game myGame2 = new Game("Dragon's Dogma: Dark Arisen");
        Game myGame3 = new Game("Morrowind");

        myPc.installGame(myGame1);
        myPc.installGame(myGame2);

        Assertions.assertEquals("Playing Duck Game", myPc.playGame(myGame1));
        Assertions.assertEquals("Playing Dragon's Dogma: Dark Arisen", myPc.playGame(myGame2));
        Assertions.assertEquals("Game not installed", myPc.playGame(myGame3));
    }

//    @Test
//    public void canPreinstallGames() {
//        PowerSupply myPsu = new PowerSupply();
//        ArrayList<Game> preInstalled = new ArrayList<>(){{
//            add(new Game("Dwarf Fortress"));
//            add(new Game("Baldur's Gate"));
//        }};
//
//        Computer myPc = new Computer(myPsu, preInstalled);
//
//        Assertions.assertEquals(2, myPc.installedGames.size());
//        Assertions.assertEquals("Dwarf Fortress", myPc.installedGames.get(0).name);
//        Assertions.assertEquals("Baldur's Gate", myPc.installedGames.get(1).name);
//    }
}
