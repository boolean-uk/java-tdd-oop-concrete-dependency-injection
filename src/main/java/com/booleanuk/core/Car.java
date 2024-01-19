package com.booleanuk.core;

public class Car {
    private Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    public void accelerate(){
        this.engine.ignite();
        this.engine.injectFuel();
    }

}
