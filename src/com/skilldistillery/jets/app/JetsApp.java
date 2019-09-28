package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class JetsApp {
	
	public static void main(String [] args) {
	
		Scanner kb = new Scanner(System.in);
		JetsApp ja = new JetsApp();
		ja.run();
		
	}
	public void run() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("JetsName"));
			String JetsName;
			
			while ((JetsName = br.readLine()) != null) {
				String array1[] = JetsName.split(", ");
				System.out.println(JetsName);
			
//				for(String temp: array1) {
//					temp 
//					System.out.println(temp);
//				
//				 String[] array1 = JetsName.split(", ");
//				 for(String temp: array1) {
//					 
//				 String model = array1[1];
//			        double speed = Double.parseDouble(array1[2]);
//			        int range = Integer.parseInt(array1[3]);
//			        long price = Long.parseLong(array1[4]);
			        
//			        System.out.println(Jetsname);
//			        Jet j = Jet(model, speed, range, price);
//			        
//			        Airfield.setJets();
			        
//				System.out.println(JetsName);
//				 }		
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
