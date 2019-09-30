package com.skilldistillery.jets.app;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Airfield {
	
	private ArrayList<Jet> fleet = new ArrayList<Jet>();

// Constructors
	
	public Airfield(ArrayList<Jet> fleet) {
		super();
		this.fleet = fleet;
	}
	
	public Airfield(Jet type, String model, double speed, int range, long price) {
	}
	
	public Airfield() {
	}
	
	// Methods
	public ArrayList<Jet> getJets() {
		return fleet;
	}
	public void addJet(Jet j) {
		fleet.add(j);
	}
	public void flyAll() {
		for (int i = 0 ; i < fleet.size() ; i++) {
			fleet.get(i).fly();
		}
	}
	public void loadCargo() {
		for (int i = 0 ; i < fleet.size() ; i++) {
			fleet.get(i).loadCargo();
		}
	}
	public void fight() {
		for (int i = 0 ; i < fleet.size(); i++) {
			fleet.get(i).fight();
		}
	}
	public void deleteJet(int i) {
		
		fleet.remove(i);
		
	}
	
	public void fastestJet() {
		double fastest = 0;
		Jet j = null;
		for (int i = 0 ; i < fleet.size(); i++) {
			if (fleet.get(i).getSpeed() > fastest) {
				fastest = fleet.get(i).getSpeed();
				j = fleet.get(i);
			}
		}
		System.out.println("The fastest Jet in the fleet is :" + j);
	}
	public void longestRange() {
		double longest = 0;
		Jet j = null;
		for (int i = 0 ; i < fleet.size(); i++) {
			if (fleet.get(i).getRange() > longest) {
				longest = fleet.get(i).getSpeed();
				j = fleet.get(i);
			}
		}
		System.out.println("The longest range jet in the fleet is :" + j);
	}
}
