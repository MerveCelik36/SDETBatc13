package com.syntaxclass06;

import java.util.Scanner;

public class Homework {
	public static void main(String[]args) {
		System.out.println("***HOMEWORK-1***");
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your country name");
		 String country= input.next();
		 String language = null;
		 
		switch (country) {
		case"Turkey":
		language= "Turkish";
		break;
		case "America":
		language= "English";
		break;
		case "Germany":
		language= "German";
		break;}
		System.out.println("If you are from " + country+ ", your language is " + language);
		
		
		System.out.println("***HOMEWORK-2***");
		System.out.println("Please enter your grade, we want to check your status.");
		String grade=input.next();
		String status= null;
		switch(grade) {
		case"A": status="Excellent"; break;
		case"B": status="Good"; break;
		case"C": status="Avarage"; break;
		case"D": status="Bad"; break;
		default: status="Not acceptable";}
		System.out.println("if your grade is "+ grade+", your succeed status is "+ status);
		
		
		System.out.println("***HOMEWORK-3***");
		
		System.out.println("Please enter 2 numbers");
		double num1= input.nextDouble();
		double num2=input.nextDouble();
		double result=0;
		 
		
		System.out.println("Please enter an operator");
		String operator= input.next();
		
		switch(operator) {
		case"+":
		 result = num1+num2;
		 break;
		case"-":
		 result = num1-num2;
		 break;
		case"*":
		 result= num1*num2;
		 break;
		case"/":
		 result= num1/num2;
		 break;
		default:
			System.out.println("invalid");
			
			
		}
		
	System.out.println(num1+" "+operator+" "+num2+"="+ result);	
		
			
		}
		
		
		
		
		
		
			 
		 
		 
		 
		
		
		
		
		
		
	}

