package com.syntaxclass05;

public class LogicalOperators {

	public static void main(String[] args) {
		// when we waNT TO CHECK TWO OR MORE CONDITIONS TOGETHER
		//WHAT IS-->  && AND, || OR , ! logical NOT(reverse the condition) condition can be either true or false
		/* How && is works;
		 * true && true--> true
		 * true && false --> false
		 * false && true --> false
		 * false && false--> false
		 * how IS || WORKS;
		 * true && true--> true
		 * true && false --> TRUE
		 * false && true --> TRUE
		 * false && false--> FALSE
		 */
		// NOTE= " >=" IS RELATIONAL OPERATOR***
		boolean sunny= true;
		boolean hot= true;
		if (sunny && hot) { System.out.println(" i am going to the beach");}
		
		boolean rain= true;
		boolean cold= true;
		
		if (rain || cold) {System.out.println("I am staying home");}
		boolean job= true;
		
		boolean checkboxSelected= false;
		if( !checkboxSelected){System.out.println(" I will click on checkbox");}
		// if its fALSE, turning true, if its true, turns false.
		
		
		double salary= 100000;
		
		if (job && salary>=100000) {System.out.println("I am happy");}

		

		int num1= 65;
		int num2=66;
		int num3= 23;
		
		if (num1>num2 && num1>num3) { System.out.println(" The largest number is " + num1);}
		else if ( num2>num1 && num2>num3) { System.out.println( " The largest number is "+ num2);}
		else if (num3>num1 && num3>num2) { System.out.println(" The largest number is "+ num3);}
		
		// easy and 2. way

		 int num4= 240;
		 int num5=240;
		 int num6= 230;
		 int largest = 0; // compiler put 0 here to initialize variable to its default value.
		                  /* 
		                   * string--> null
		                   * double--> 0.0
		                   * boolean-->false
		                   * intiger--> 0
		                   */
		
		
		if (num4>=num5 && num4>num6) { largest= num4;}
		else if ( num5>num4 && num5>num6) { largest= num5;}
		else if (num6>num4 && num6>num5) { largest= num6;}
		
		System.out.println("the larger number is "+ largest);// will give error because the largest variable is not initialized.		
	
	// NOTE; if all of conditions are wrong. result will be the first entry which is "0".
	
	}	
	
	}