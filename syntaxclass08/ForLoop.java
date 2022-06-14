package com.syntaxclass08;

public class ForLoop {

	public static void main(String[] args) {
		// saying good morning 5 times
		for(int i=1; i<=5; i++) {
			System.out.println("good morning");
			// we create a variable with number, we give how many times we want to repeat it. then increase or decrease
		}

		// what if we decrease it:it will go infinity. because all minus are <5
		for (int i=1; i<=5; i++) {
			System.out.println("hello");
		}
		/* start point
		 * end point
		 * increment/ decrement
		 * this is how we create our for loop
		 */

		for (int i=60; i>=10; i-=2) {
			System.out.println(" another example");// until here we increase 
			// or decrease we use++ or -- mean was only 1 + 1 of 1-1. if we do
			// i+=5 means we want every time 5+5 or i-=10 means every time10-10...
			// yukaridaki ornek 30 kere yazildi.
			
		}
		
		
		for (int i= 1; i<=100; i++) {
			System.out.println(i+"");
		}
		for (int i=100; i>=1; i--) {
			System.out.println(i+"");
			
		}
		
		for (int a=0; a<=20; a+=2) {
			System.out.println(a+ "");
		}
		
		
		for (int b=21; b<=51; b+=2) {
			System.out.println(b+ "");
		}
		
		
		// note: if we use a variable in a loop, it will exist only in this loop. we can use it again in another data type.
	}

}
