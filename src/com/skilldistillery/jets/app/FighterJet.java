package com.skilldistillery.jets.app;

public class FighterJet extends Jet{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
		
	
	@Override
	public String toString() {
		return "FighterJet [model=" + getModel() + ", speed=" + getSpeed() + ", range=" + getRange() + ", price=" + getPrice() + "]\n";
	}
	@Override
	public void fly() {
		double time = getRange() / getSpeed() ;
		System.out.println(getModel() + " is flying at speed of " + getSpeed() + "mph and can fly for " + time + " hours") ;
	}
	@Override
	public void fight() {
		System.out.println(getModel() + "is joining the fight");
	}
}
