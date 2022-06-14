package com.syntaxclass11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops).
		 */
         Scanner scanner=new Scanner(System.in);
         System.out.println("please enter the size of the array");
         int arraysize=scanner.nextInt();
         String [] countryArray=new String[arraysize];
         for(int i=0; i<countryArray.length;i++) {
        	 
        	 countryArray[i]=scanner.next();// taking input 
        	 
         }
         
         for (String element:countryArray) {
        	 if(element.equalsIgnoreCase("usa")) {
        		 System.out.println("Washington DC");
        	 }else if (element.equalsIgnoreCase("Turkiye")) {
        		 System.out.println("Ankara");
        	 }else if (element.equalsIgnoreCase("Thailand")) {
        		 System.out.println("Bankok");
         }else {
        	 System.out.println(" Counrty not found");
         }
	}

}
}