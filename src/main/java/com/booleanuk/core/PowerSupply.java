package com.booleanuk.core;

public class PowerSupply {
    private boolean isOn = false;

    public void turnOn() {
        this.isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
