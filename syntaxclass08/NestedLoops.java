package com.syntaxclass08;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// loops into another loops.
		// we can nest any type of loop into another loop
		
		for (int i=1; i<=3; i++) { // outer loops
			System.out.println("hello");
			for (int y=1; y<=2; y++) {// nested loops
				System.out.println("bye");
			}
		}
    System.out.println("====================");
		
		for (int i=1; i<=3; i++) {
			for (int y=1; y<=2; y++) {
				System.out.println(i+ " "+y);
		}
		
		}
		
		System.out.println("====================");
		for (int i=1; i<=3; i++) {
			System.out.println("hello");
		
			for (int y=1; y>=2; y++) {// no output here
				System.out.println("bye");
		
			}
		}
		
		
		System.out.println("====================");
		for (int i=1; i>=3; i--) {// no output because outer condition is false
			System.out.println("Hello");
			for (int y=1; y<=2; y++) {
				System.out.println("bye");
			}
		}
		
		
		// how to create multiplication table
		  
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				
				System.out.println(x + " * "+y+" = "+ (x*y));
				
				
				
			}
			  
			  
			  
		  }
		
		
		
		
		
	}

}
