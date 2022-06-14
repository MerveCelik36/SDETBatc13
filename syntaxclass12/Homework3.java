package com.syntaxclass12;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
         /*Write a program that reads two people's first
	     *names and if they expecting boy or girl? 
         *Based on the input suggests a name for a baby:
		 */
		Scanner scan= new Scanner(System.in);
		String mom="Gulcin";
		String dad="Murat";
		System.out.println("Please enter your baby's gender");
		String babyGender=scan.nextLine();
		
		if (babyGender.equalsIgnoreCase("girl")) {
			String name=mom.substring(0,3);
			String name2= dad.substring(3, 5);
			System.out.print(name+name2);}
			
			else{
				String name3=dad.substring(0,3);
				String name4= mom.substring(3, 5);
				System.out.print(name3+name4);
			}
			
		}
	

	}


