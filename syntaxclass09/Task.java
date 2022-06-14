package com.syntaxclass09;

public class Task {

	public static void main(String[] args) {
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
		
		char[] word= new char[6];
		word[0]='A';
		word[1]='B';
		word[2]='B';
		word[3]='D';
		word[4]='E';
		word[5]='F';
		System.out.println(word[1]);
		
		char[] word1= {'A','B', 'C', 'D', 'E','F'};
		System.out.println(word1[1]);
				
		//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
		String [] key= {"Java", "Saturday","day","coding","is"};
		System.out.println(key[1]+ " "+ key[4]+" "+ key[0]+ " "+ key[3]+ " "+ key[2] );

	   for (int i=0; i<word1.length; i++) {
		   System.out.print(word1[i]+" ");
	   }
       for (int i=0; i<key.length; i++) {
    	   
    	   System.out.print(key[i]+" ");
       }
       

       int arr[]= {33,3,4,5};
       for (int k:arr) 
    	   
    	   System.out.println(k);
       
       
       }
       
       
       
       
       
	}


