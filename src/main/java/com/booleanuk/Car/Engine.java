package com.booleanuk.Car;

public class Engine {
	static Engine e = null;

	public void ignite(){
		System.out.println("Ignite");
	}

	public void injectFuel(){
		System.out.println("Injecting fuel");
	}

	public Engine(){
		e = this;
		System.out.println("Creating new engine");
	}


	public static synchronized Engine getInstance(){
		if (e == null){
			e = new Engine();
		}
		return e;
	}
}
