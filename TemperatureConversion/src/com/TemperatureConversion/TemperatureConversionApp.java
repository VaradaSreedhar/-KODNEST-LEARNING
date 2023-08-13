package com.TemperatureConversion;

import java.util.Scanner;

public class TemperatureConversionApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Temperautre Cpnversion Tool ");
		System.out.println("enter your choice  ");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println(" Celsius To Farenheit Conversion ");
			System.out.println("Enter the temperature in degree -C");
			double c=scan.nextDouble();
			double tf=celsiusToFahrenheit(c);
			System.out.println(tf);
					
		}
		else if(choice==2)
		{
			System.out.println(" Fahrenheit To Celcius Conversion ");
			System.out.println("Enter the temperature in degree -F");
			double f=scan.nextDouble();
			double tc=fahrenheitToCelsiuss(f);
			System.out.println(tc);
		}
		else
		 {
			System.out.println("Enter a valid option ");	
		 }
			
		
		
	}
	public  static double celsiusToFahrenheit(double celsius)
	{
		
		return (celsius * 9/5) + 32;
		
	}
	public static double fahrenheitToCelsiuss(double fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
	}

}
