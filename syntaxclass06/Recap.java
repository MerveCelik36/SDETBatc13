package com.syntaxclass06;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner merve= new Scanner(System.in);
		System.out.println(" Enter your score");
		char grade;
		
		int avarageS= merve.nextInt();
		if (avarageS>= 50 && avarageS<70) { grade='A';
		System.out.println("you are a "+ grade+ " student");
		 if (avarageS >= 70 && avarageS <80)
		grade='B';
		}

	}

}
