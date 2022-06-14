package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
	// simple if is if (boolean expression) 
    // code a; will executed only if variable is true
	// nested if, if is inside another if statement. 
	// other name for nested is inner.
	// if (boolean expression) { // nested-inner
		//code b;
		// if aura if false, nested if is just nothing. 
		// when we need nested check, if aura if is correct and we need more detail
		// for example; you went to the doctor. doctor ask do you use any medicine=yes--> aura if
		// if yes, what kind of medicines--> nested if . if no, there is no nested if
		
		boolean vaccine = true;
		int dose=1;
		if (vaccine){
			System.out.println("let me check if you have secon dose");// there will be output.
		
		if (dose==1) 
			System.out.println("you need one more shot");}
		else{ System.out.println("You are fully vaccinated");}
		boolean vaccine2=false;
		int dose2=2;
		
		if (vaccine2){ System.out.println("let me check if you have secon dose");// no output because it is false 
		if (dose2 ==1)System.out.println("you need one more shot");}// aura if false, so inner wont be output as well		
	System.out.println("----------------------------");
		
	String month="May";
	int day= 8;
	if (month.equals("May")) {System.out.println("we have mothers day");
	
	
	  if (day==8)  System.out.println("today is mothers day");}
	  
	else if (month.equals("June")) { System.out.println("today is fathers day");
	   if (day==19) System.out.println("today is fathers day");}
	System.out.println("--------------------------");
	// NOTE: NESTED IS ALWAYS DEPENDINCY AND IF THERE IS NO AURO IF, NO NESTED IF. AURA IF WRONG
	// NO NESTED IF. "IF" CAN HAVE NESTED IF AND "ELSE IF "
	// CAN HAVE NESTED IF :)

	}
	}
	
