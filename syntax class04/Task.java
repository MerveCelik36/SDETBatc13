package com.syntax.class04;

public class Task {

	public static void main(String[] args) {
		// write a program to check whether number is positive or negative
	boolean num= true;
	if (num) { System.out.println("positive");}
	else { System.out.println("negative");}
	System.out.println("--------------------");
	// example:
	int a= 0;
	if (a>0) {System.out.println(a+ " is positive");}
	else if ( a==0) {System.out.println(a+ " is not positive or negative");}
	// else if (a=0) will give error because a is an int not boolean. thats why it is ==
	else { System.out.println(a+ " is negative");}
	
	// String data type how its work? dont use == instead .equals and parantez
	
	String browser= "explorer";
	if (browser.equals("chrome"))
	{System.out.println(" all test cases will be executed");}
	else { System.out.println(" I am not executing any test cases");
	System.out.println("reason- wrong browser");}
	}
	
	
	
	
	}


