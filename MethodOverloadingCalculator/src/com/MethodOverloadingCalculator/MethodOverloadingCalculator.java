package com.MethodOverloadingCalculator;

import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Two Numbers ");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		System.out.println("Enter A Operator ");
		char c=scan.next().charAt(0);
		System.out.println(calculate( c,a,b));
		
	}
	public static double calculate(int a ,int b, char operator)
	{
		int res = 0;
		switch(operator)
		{
		case '+':
			res=a+b;
			break;
		case'-':
			 res= a-b;
			 break;
		case'*':
			 res=a*b;
			 break;
		case '/':
			 res=a/b;
			 break;
		default:
			System.out.println("Enter a Valid Option ");
		}
		return res;
	}
	public static double calculate(char operator, int a ,int b)
	{
		int res = 0;
		switch(operator)
		{
		case '+':
			res=a+b;
			break;
		case'-':
			 res= a-b;
			 break;
		case'*':
			 res=a*b;
			 break;
		case '/':
			 res=a/b;
			 break;
		default:
			System.out.println("Enter a Valid Option ");
		}
		
		return res;

	}
		
	
	public static double calculate(double b,double a,char operator)
	{
		double res = 0;
		switch(operator)
		{
		case '+':
			res=a+b;
			break;
		case'-':
			 res= a-b;
			 break;
		case'*':
			 res=a*b;
			 break;
		case '/':
			 res=a/b;
			 break;
		default:
			System.out.println("Enter a Valid Option ");
		}
		return res;
	} 
	public static double calculate(char operator,double a,double b)
	{
		double res = 0;
		switch(operator)
		{
		case '+':
			res=a+b;
			break;
		case'-':
			 res= a-b;
			 break;
		case'*':
			 res=a*b;
			 break;
		case '/':
			 res=a/b;
			 break;
		default:
			System.out.println("Enter a Valid Option ");

		}
		return res;
	}



	

}
