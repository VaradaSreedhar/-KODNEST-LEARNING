package com.TaxCalculator;

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter purchaseamount and taxrate ");
		Double p=scan.nextDouble();
		Double t=scan.nextDouble();
		System.out.println(calculateTotalWithTax(p,t));
	}
	
	public static double calculateTotalWithTax(double purchaseamount, double taxrate)
	{
		return (purchaseamount*taxrate)+purchaseamount;
	}
	
	

}
