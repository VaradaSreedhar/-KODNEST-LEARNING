package com.TheCakcualtorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter two nubers and a character ");
		int a=scan.nextInt();
		int b =scan.nextInt();
		char c=scan.next().charAt(0);
		arthimeticOperation(a,b,c);
		
	}
	
	public static void arthimeticOperation(int num1, int num2,char operator)
	{
		int res=0;
		switch(operator)
		{
		case '+':
			res=num1+num2;
			System.out.println(res);
			break;
		case '-':
			res=num1-num2;
			System.out.println(res);
			break;
		case '*':
			res=num1*num2;
			System.out.println(res);
			break;
		case '/':
			res=num1/num2;
			System.out.println(res);
			break;
		case '%':
			res=num1%num2;
			System.out.println(res);
			break;
			default:
				System.out.println("error occured ");
			
		}
	}

}
