package com.JourneyCaluculator.com;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter speed and time to calculate distance ");
		double speed=scan.nextDouble();
		double time =scan.nextDouble();
				
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		double distance=journeyCalculator.calculateDistance(speed,time);
		System.out.println(distance);
		
		
	}
}
