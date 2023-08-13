package com.galacticArithmetic;

import java.util.Scanner;

public class Arthimetic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Numbers ");
		int num1=scan.nextInt();
		long num2=scan.nextLong();
		System.out.println(galacticAddition( num1, num2));
		
	}
	
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}
