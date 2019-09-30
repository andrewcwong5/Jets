package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;

public class Airfield2 {
	private List<Jet> myList = new ArrayList<Jet>();
	
	}
	
	public Jet jetsTwo[];

//	Methods
	
	public void addJet(Jet j) {
		myList.add(j);
	}
	public void startData() {
		String model = 
		FighterJet, "F-15", 1400.00, 30000, 150000000
		FighterJet, "F-22", 1400.00, 30000, 150000000
		FighterJet, "F-35", 1400.00, 30000, 150000000
		CargoPlane, "C-130", 400.00, 30000, 1000000
		JetImpl, "737", 600.00, 40000, 15000000
		Jet [model="737", speed=600.0, range=40000, price=15000000]
}
