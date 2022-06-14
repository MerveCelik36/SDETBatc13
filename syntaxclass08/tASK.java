package com.syntaxclass08;

import java.util.Scanner;

public class tASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		 int num1=100;
		 int num2;
		 do {
			 System.out.println("enter a number and try to find my secret number");
			 num2=input.nextInt(); }
		while (num1!=num2); 
			System.out.println(" wrong number");
			
			
		
		System.out.println(" You got it");
		
	}

}
