package com.temperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Temperature in f ");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double tempincelcius=temperatureConverter.convertFahrenheitToCelsius(f);
				System.out.println(tempincelcius);
	}
}
