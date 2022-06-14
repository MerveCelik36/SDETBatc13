package com.syntaxclass05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TASK 1");
 Scanner merve= new Scanner(System.in);
  int age= merve.nextInt();
  if (age>=18) {
	  System.out.println( "You are eligible for driver license");
  } else { 
	  System.out.println("You will need to get a learner permit");
	
  }
  
  
  System.out.println("TASK 2");
  
  System.out.println("Do you have a credit card");
  
 String answer=merve.next();
 int balance= 999;
 if (answer.equalsIgnoreCase("no")) { 
	 System.out.println(" We will offer you a credit card");
	 }else {
		 System.out.println("What is balance on the card");
	    if (balance>100) { 
	    	System.out.println("Pay it off immediatelly");}
	    
	 else  
	    	System.out.println(" You can spend more");}
	    
	  
	 }
	}
	
 
	
	  
	 
	  
  
 
  
  
  
  
	


