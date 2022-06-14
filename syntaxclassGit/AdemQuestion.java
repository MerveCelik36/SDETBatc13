package com.syntaxclassGit;

import java.util.Scanner;

public class AdemQuestion {
	public static void main(String[] args) {
		/*
			 * Write a program to ask a user to enter item they want to buy -- DONE and the
			 * price of that item. -- DONE Every time user enters money, accumulate the
			 * amount and tell the user how much is left to pay off. If user give more money
			 * program should return a change. Whenever a user done with payments program
			 * should say "Thank you for shopping!"
			 */
		   Scanner scan = new Scanner(System.in);
	        System.out.println("What do you wanna buy?");
	        String item = scan.nextLine();
	        System.out.println("the price for the " + item + " is:");
	        int price = scan.nextInt();
	        System.out.println("how much are you going to pay?");
	        int customerpaid = 0;

	        customerpaid = scan.nextInt();

	        if (customerpaid > 0 && customerpaid < price) {
	            while (customerpaid < price) {
	                int remaining = price - customerpaid;
	                System.out.println("you paid " + customerpaid + ". Your remaining balance is " + remaining);

	                System.out.println("How much more are you going to pay");
	                customerpaid += scan.nextInt();

	                if (customerpaid > 0 && customerpaid < remaining) {
	                    remaining -=  customerpaid;
	                    System.out.println("you paid " + customerpaid + ". Your remaning balance is " + remaining);
	                }

	            }
	        } else if (customerpaid > price) {
	            int change = price - customerpaid;
	            System.out.println("please take your change back " + change);
	        }
	            System.out.println("Thank you for your payment");
				
				
				
				
				
				
			}
				
				
				
	
		
	}


