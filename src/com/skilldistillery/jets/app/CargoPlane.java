package com.skilldistillery.jets.app;

public class CargoPlane extends Jet {
	

	// Constructor
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	// Methods
	public void loadCargo() {
		String load = "Loading cargo" ;
		System.out.println(load);
	}
}
