package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		/*
		 * we need to check if repel completed
		 * if repel is completed we want to see= aura if
		   * if you did 15 and more assignment--> great job = nested
		   * if you did more then 10--> you did good =nested
		   * if you did less then 10--> complete more assignments. = nested
		 */
		
		
		boolean didRepel= true;
		int assignments;
		if (didRepel) {
			System.out.println("How many assignment have you done");
			assignments=14;
			if (assignments> 15) 
				System.out.println("You did a great job");
			else if (assignments>10) 
				System.out.println("You did a good job");
			else 
			System.out.println("Please complete all repel");
			
			}else { 
			System.out.println(" you should complete your repel homework");}
		}	
	}

		
		
	
		
		
	
	


