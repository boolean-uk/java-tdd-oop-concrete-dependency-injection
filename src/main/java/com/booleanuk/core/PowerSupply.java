package com.booleanuk.core;

public class PowerSupply {
    private boolean isOn = false;
    public boolean getIsOn(){
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }
}
