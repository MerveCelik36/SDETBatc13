package com.syntax.class03;

public class IfStatements {

	public static void main(String[] args) {
	/*
	 * declare a variable rate
	 * if rate is more then 5--> i am not buying the house
	 
	 */
    double mortgageRate= 5.5;
    if (mortgageRate>5) {System.out.println("I am not buying a house");}
    mortgageRate=4.5;
    if(mortgageRate< 4.7) {System.out.println("I am buying a house");}
    /*
     * declare 2 variables and check if num1 is bigger then num2
     */
    int num1=99;
    int num2=10;
    if (num1>num2) {
    	System.out.println(num1 + " is bigger than "+ num2);}// if it is correct, we will see the an output if it is false, we cannot see any output.
     
    /*
     * declare temperature
     * if temp is higher than 75--> i will go for a walk
     */
    int tem= 78;
    if (tem>75) {
    	System.out.println("I will go for a walk");// output geldi cunku if statement dogruydu.
    }
    
    // ohterwise= else whwn conditions is false
    tem=68;
    if (tem>75) {
    	System.out.println("I will go for a walk");}// not printed
    else {
    	System.out.println("I am going to study java");// printed
    	} 
	
	char gender= 'm';
	 if (gender=='f') {
		 System.out.println(" you like shopping");
	 } else { System.out.println("you like watching sports");}
	  String browser= "chrome";
	  if (browser.equals("chrome")) {
		  System.out.println(" it will work");// printed
		  } else {
			  System.out.println("it will not");// not printed
			  
		  }
		  }
		  
	  
	 
	 }
  
    

 
    
    
    
	



