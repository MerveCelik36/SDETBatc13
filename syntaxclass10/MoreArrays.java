package com.syntaxclass10;

import java.util.Arrays;

public class MoreArrays {

	public static void main(String[] args) {
		//From an array of integer elements find the largest number.

		int [] num= {1,2,3,4};
		int max=num[0];
			
			
		for (int i=0; i< num.length; i++) {
			if (num[i]>= max) {
				
			max= num[i];
			}	
		}
System.out.println("Max num is : "+ max );

//Create an array to store char values and then print those
//in reverse order

char []ch= { 'a', 'b','c'};

  for(int i=ch.length-1; i>=0;i--) {// length 4 is4-1 is going to 3 container which is 'c'
	
	  System.out.print(ch[i]+" ");

	
}


	}

}
