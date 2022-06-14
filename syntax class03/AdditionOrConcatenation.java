package com.syntax.class03;

public class AdditionOrConcatenation {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		String c= "hello";
		String d="Hi";
		System.out.println(a+b+c+d);// 30HelloHi (int we sum, strings are individual)
		System.out.println(a+c+b+d);// 10Hello30Hi
		System.out.println(c+d+a+b);// HelloHi1020
		System.out.println(c+d+(a+b));// HelloHi30
		
		// Java goes top to bottom and left to right. if you start print with String on the lest, it will calcutale int again as a string type
		
        boolean boo= true;
        System.out.println(c+boo);
        
        
        		
	}

}
