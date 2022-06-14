package com.syntaxclass08;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		//Write a program to ask a user to enter item they want to buy and the price of that item. 
		//Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
		//If user give more money program should return a change.
		//Whenever a user done with payments program should say “Thank you for shopping!”
		
		System.out.println("Enter the item you want to buy");
		String item=input.next();
		
		int itemprice=input.nextInt();
		int moneySpend;
	
		int remaining=0;
		do {
			System.out.println("Please insert your money");
			moneySpend=input.nextInt();
		    if (moneySpend<itemprice);{
		    	remaining= itemprice-moneySpend;
		    	
		    	System.out.println("The remaining balance is "+remaining);}
		    	
//		    if(moneySpend>=itemprice) {
//		    	  remaining= moneySpend-itemprice;
//		    	  System.out.println("Your change back is " +remaining);
//		      }
		                               
		    }while(moneySpend- itemprice!=0);
		    	 if (moneySpend-itemprice==0);{System.out.println("thank you for shopping");}
		
		
				
				
		 
		 }
}	

	
	
			
	
	


