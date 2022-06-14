package com.syntaxclass08;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.print("Start point: ");
		int i= input.nextInt();
		
		System.out.print("End point: ");
		int b= input.nextInt();
		int sumOdd = 0;
		int sumEven = 0;
		
		for (int x=i; x<=b; x++) { 
			if (x%2==0) {
		     sumEven+=x;
			}
			if (x%2!=0) {
				 sumOdd+=x;
				}
			
		}
			
			System.out.println("Start range " + i+ " and and range "+b+ " is "+sumEven );
			
			System.out.println("Start range " + i+ " and and range "+b+ " is "+sumOdd );
			
			
		  
			  
			
		  }
		  }

	

