package com.syntaxclass11;

public class Task3 {

	public static void main(String[] args) {
		//Create a 2D array of integer values. Print the sum of all numbers.
		
		
		int [][] arr= {  {10,15,10},
		                 {20,50,20},
		                 {30,30,30} };
		//System.out.println(arr[0][0]);//10
		//System.out.println(arr[0][1]);//15
		//System.out.println(arr[0][2]);
		//System.out.println(arr[1][0]);
		//System.out.println(arr[1][1]);
		//System.out.println(arr[1][2]);
		//System.out.println(arr[2][0]);
		//System.out.println(arr[2][1]);
		//System.out.println(arr[2][2]);
		int sum=0;
		for (int i =0; i <arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				
				sum= sum+arr[i][j];
			
			System.out.println(sum);}
		}
		
	}

}
