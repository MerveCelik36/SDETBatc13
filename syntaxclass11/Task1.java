package com.syntaxclass11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// using scanner create an array of integer value. after array created,
		// calculate the sum of all stored element in that array
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please Enter the size of the array you wanna create");
		
		int arraysize=scanner.nextInt();
		System.out.println("the size of the array is "+ arraysize);
		int [] IntegerArray=new int [arraysize];// we cant use enhance for loop
		// for inserting or updating the values of an array
		System.out.println("please enter "+arraysize+" elements");
		
		for (int i=0; i<IntegerArray.length; i++) {
		IntegerArray[i]=scanner.nextInt();}

	
		System.out.println(Arrays.toString(IntegerArray));
		
		int sum=0; 
		for(int element: IntegerArray) {
			sum=sum+element;
		}
		
		System.out.println("the sum of the element is "+sum);
	}

}
