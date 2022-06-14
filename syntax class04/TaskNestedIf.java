package com.syntax.class04;

public class TaskNestedIf {

	public static void main(String[] args) {
		
		// TASK1
		
		boolean diploma= true;
		if (diploma) {
			System.out.println("Congratulations!");
			int gpaScore=4;
			if (gpaScore>3.5) {
				System.out.println("You are eligible for scholarship");
			
			}else {
				System.out.println("You should have studied harder.");}
		
	System.out.println("------------------------------");
	// TASK2
	int mortgage= 3;
	if (mortgage> 4.5) {
		System.out.println("Not buy a house");
	} else {
		System.out.println("Can buy a house");
		int price= 60000;
		if (price<50000)
			System.out.println("take a loan");
		else System.out.println("will pay cash");
		
	}
		
	}
	
		
	

	}
	}

