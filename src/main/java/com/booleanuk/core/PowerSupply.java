package com.booleanuk.core;

public class PowerSupply {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }
}
