package com.skilldistillery.jets.app;

public class CargoPlane extends Jet {
	

	// Constructor
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	// Methods
	@Override
	public void loadCargo() {
		String load = "is loading cargo" ;
		System.out.println(getModel() + load + " and transporting it " + getRange() + " miles");
	}
	
	@Override
	public String toString() {
		return "Cargo Plane [model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price=" + getPrice() + "]\n";
	}
}
