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
	public void setAirfield() {
		fleet.add(null);
	}
	
}