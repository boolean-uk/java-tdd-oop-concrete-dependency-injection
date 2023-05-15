package com.booleanuk.core;

public class PowerSupply {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void turnOn() {
        setOn(true);
    }
}
