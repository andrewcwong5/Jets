package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.skilldistillery.io.solutions.Planet;

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
//				String array1[] = JetsName.split(", ");
//				for(String temp: array1) {
//					System.out.println(temp);
//				}
				 String[] array1 = JetsName.split(", ");
			        String model = array1[0];
			        double speed = Double.parseDouble(array1[1]);
			        int range = Integer.parseInt(array1[2]);
			        long price = Long.parseLong(array1[3]);
			        Jet j = new Jet(model, speed, range, price);
			        // System.out.println(p);
			        jets.add(j);
//				System.out.println(JetsName);
				
				
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
