package com.booleanuk.Car;

public class Car {
	public void accelerate(){
		Engine engine = Engine.getInstance(); //singleton test
		engine.injectFuel();
		engine.ignite();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.accelerate();
		car.accelerate();
	}

}
