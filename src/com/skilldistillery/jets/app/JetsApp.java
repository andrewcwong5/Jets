package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class JetsApp {
	
	ArrayList<Jet> jets = new ArrayList<Jet>();
	Scanner kb = new Scanner(System.in);
	static boolean isChoose;
	Airfield af = new Airfield();
	
	public static void main(String [] args) {
	
		JetsApp ja = new JetsApp();
		
		ja.run();
		
	}
	public void run() {
		
		startData();
		
		do { isChoose = true;
		
		printMenu();
		menuOptions();
		} while (isChoose == true) ;
	}
	public void startData() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("JetsName"));
			String line;
			
			while ((line = br.readLine()) != null) {
				String array1[] = line.split(", ");
//				System.out.println(line);
				
				String type =  array1[0];
				String model = array1[1];
				double speed = Double.parseDouble(array1[2]);
				int range = Integer.parseInt(array1[3]);
				long price = Long.parseLong(array1[4]);				
				
				if ( array1[0].equalsIgnoreCase("FighterJet")) {
					Jet fJ = new FighterJet(model, speed, range, price);
					af.addJet(fJ);
					
				}   
				else if( array1[0].equalsIgnoreCase("CargoPlane")) {
					Jet cP = new CargoPlane(model, speed, range, price);
					af.addJet(cP);
//					
				}	
				else if( array1[0].equalsIgnoreCase("JetImpl")) {
					Jet jI = new JetImpl(model, speed, range, price);
					af.addJet(jI);
//					
				}
		
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public void printMenu() {
		System.out.println("********************************");
		System.out.println("|1. List fleet                 |");
		System.out.println("|2. Fly all jets               |");
		System.out.println("|3. View fastest jet           |");
		System.out.println("|4. View jet with longest range|");
		System.out.println("|5. Load all Cargo Jets        |");
		System.out.println("|6. Dogfight!                  |");
		System.out.println("|7. Add a jet to Fleet         |");
		System.out.println("|8. Remove a jet from Fleet    |");
		System.out.println("|9. Quit                       |");
		System.out.println("********************************");
		System.out.println("Make a selection 1-9:");
	}
	void menuOptions () {
		int choice = kb.nextInt();
			
			System.out.println("");
		
			switch (choice) {
				
				case 1:			
					System.out.println(af.getJets());
					System.out.println("Total number of planes: " + af.getJets().size());
					break;	
				case 2:			
					af.flyAll();
					break;
				case 3: //view fast jet
					fastestJet(jets);
					break;
				case 4:	//jet with longest range
					longestRange(jets);
					break;
				case 7: //add a single jet to fleet
					addAJet();
					break;
				case 9: //quit program
					isChoose = false;
					break;	
				default:
					System.out.println("Invalid selection, choose again 1-5");
					break;
			}
		}		
	
		
	public void fastestJet(ArrayList<Jet> list) {
//		Jet.getSpeed();
	}
	public void longestRange(ArrayList<Jet> list) {
		
	}
	public void addAJet() {
		
		System.out.println("What type of Jet? FighterJet, CargoPlane, or JetImpl: ");
		String type = kb.next();
		System.out.println("What is the model? ");
		String model = kb.next();
		System.out.println("What is its speed? ");
		double speed = kb.nextDouble();
		System.out.println("What is the range?");
		int range = kb.nextInt();
		System.out.println("What is the price?");
		long price = kb.nextLong();			
		
		if ( type.equalsIgnoreCase("FighterJet")) {
			Jet fJ = new FighterJet(model, speed, range, price);
			af.addJet(fJ);		
		}   
		else if( type.equalsIgnoreCase("CargoPlane")) {
			Jet cP = new CargoPlane(model, speed, range, price);
			af.addJet(cP);			
		}	
		else if( type.equalsIgnoreCase("JetImpl")) {
			Jet jI = new JetImpl(model, speed, range, price);
			af.addJet(jI);
		}
	}
	
}
