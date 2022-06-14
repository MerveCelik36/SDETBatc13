package com.syntaxclass08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***TASK-1***");
		
		for (int i=1; i<=50; i++) {
			
			if(i%3==0) {
				continue;}
			System.out.println((i+""));
			
		}
		
		
		System.out.println("***TASK-2***");
		
		
		Scanner input= new Scanner(System.in);
		boolean creditCard;
		do {
			System.out.println("Applying a credit card?");
		
		creditCard= input.nextBoolean();
		}
		
		while (creditCard== true);
	
		
		
		System.out.println("yes");
		}
		
		
	

}


