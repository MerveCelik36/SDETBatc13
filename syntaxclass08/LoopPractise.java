package com.syntaxclass08;

import java.util.Scanner;

public class LoopPractise {
	
	public static void main(String[]args){
		int sum=0;
		for(int i=1; i<6;i++) {
			sum+=i;
		
	
		System.out.println(sum+ "");// sonuc 1 3 6 10 15 olarak gelecek
		
		}
		
		System.out.println(sum );//i artik 1+2+3+4+5=15 oldugu icin
				// sonuc 15 olacak
		
		
		 int sum1=0;
		 for (int i= 1; i<=70; i++) {
			 if (i%2==0)
			 sum1+=i;}
		 System.out.println("Sum of all even number="+ sum1);
		 for (int i=0; i<=70; i+=2) {
			 if (i!=0)
			 
			 sum1+=i;}
			 System.out.println("Sum of all odd number="+ sum1);
		 System.out.println("-------------------");
		 // another way
		 int sumEven=0;
		 int sumOdd=0;
		 for (int i=1; i<=70; i++) {
			 if (i%2==0) {
				 sumEven+=i;
			 }else {
				 sumOdd+=i;}
			 System.out.println("Sum even numbers is "+sumEven);
			 System.out.println("Sum odd numbers is "+sumOdd);
			 // note : we use while loop-* when we know in advance how many times we want to iterate
			 // while---> checking the condition first. we use when we know numbe of iteration
			 // do while--> executed codes at least once before checking condition
			 // for--> we use when we  dont know number of iteration(tekrarlama)
		
		 
		 }
	}
}
		
		
		
	

