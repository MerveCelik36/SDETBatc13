package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
   // ctrl+ space daha once syso ile kullanmistik. farkli sekillerde de kullanabiliriz. ornek;
		// main+ ctrl+ space will  bring public static void main (String() args
		
		
// widenind casting/ implicit or automatic
		int i=100;
	double d=100; //did not complain why? because its 100.0. we can store ing type of valuein double but we can store double type of value in int type of value.
	System.out.println(i); //100
	System.out.println(d); //100.0
	// casting is java is converting 1 typo into another 
	
// Narrowing casting / explicit or manually
	
	long L= 10000l;
	// byte b=130; => type mismatch: cannot convert from double to int 
	int x= (int) 99.99; //99=> narrowing 
	System.out.println(x);
	

	}

}
