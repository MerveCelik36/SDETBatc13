package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// whenever we have multiple condition we have, we use if elseif statement.
		/*
		 * declare 2 numbers and verify which one is the largest
		 */
		int num1= 20;
		int num2=67;
		if (num1> num2) { 
			System.out.println(num1+ " is larger then "+num2);
		}else {
			System.out.println(num2+ " is larger then " +num1);
			}
		
		// testing multiple conditions is if else if is 
		int num3=20;
		int num4=20;
		if (num3> num4) {
			System.out.println(num3+ " is larger then "+num4);
		} else if (num3> num4) {
			System.out.println(num4+ " is larger than "+ num3);
		}else {
			System.out.println(num3+ " is equal to "+ num4);
		}
		
		
	int day=9;
	if (day== 1) {
		System.out.println("monday");}
	else if (day==2) {
		System.out.println("tuesday");}
	else if (day ==3) {
		System.out.println("wednesday");}
	else if (day==4) { System.out.println("thursday");}
	else { System.out.println("none of them");}
		
	}
	}
		// none of if and else will be true since numbers are equal
					
					
		
		
	


