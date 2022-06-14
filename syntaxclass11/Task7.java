package com.syntaxclass11;

public class Task7 {

	public static void main(String[] args) {
		//  Write a java program to check whether a given number is prime or not?

	int x=20;
	boolean isPrime=true;
	
	if (x>1) {
		for (int i=2; i<x; i++) {
			if (x%i==0) {
		    isPrime=false;
		    break;}}
	}else { 
		isPrime=false;
		}
	if(isPrime) {
		System.out.println(x+" is prime number");
	}else {
		System.out.println(x+" is not prime number");
	}
	
	
	
	
	
	}

}
