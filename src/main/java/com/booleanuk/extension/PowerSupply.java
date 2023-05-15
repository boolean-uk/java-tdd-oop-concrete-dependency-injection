package com.booleanuk.extension;

public class PowerSupply {
    private boolean isOn = false;

    public void turnOn() {
        this.isOn = true;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
