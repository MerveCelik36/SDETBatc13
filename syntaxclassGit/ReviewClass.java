package com.syntaxclassGit;

public class ReviewClass {
	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Batch 13 is great");
			if (i>2) {
			continue;}
			System.out.println("Batch 13 is excellent");
			
			
		}
		
		int[] arr = { 1, 5, 8, 9 };
		// we can't use advance for loop to update to insert values in an array
		
		int x = 0;
		for (int number : arr) {
			arr[x] = 1;
			x++;
		}
		for (int number : arr) {
			System.out.print(number + " ");
	
		
		}
		System.out.println("hello world");
	}

}
