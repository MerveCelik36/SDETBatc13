package com.syntaxclass09;

public class ArrayIntro {

	public static void main(String[] args) {
		// create an array[]. array is a big container
		
		int[] b=new int [4];// we need to tell how many element we will store
		// 4 element we are going to store
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		//access values from my array
		System.out.println(b[2]);//70
		System.out.println(b[1]+b[2]+b[3]);//255
		
        // we need to create an array for my classmate
		String[] classMate= new String[5];
		classMate[0]="Khristina";// array is always start with 0
		classMate[1]="Merve";
	    classMate[3]="Oleg";
		classMate[4]="Adem";
		System.out.println("My classmate name is "+ classMate[3]); //Oleg
		System.out.println("------------------------------");
		
		// i want to store prices in array
		
		double[] price= new double[4];
		
		price[0]=1.99;//if we did not start from 0 , we will get error
		price[1]=2.99;
	    price[2]=3.99;
	    price[3]=4.99;
	    System.out.println(price[3]); 
	    // arrays are fixed in size
	    // during runtime Java cannot increase or decrease a size of any array
	    
	    System.out.println("another way");
	    String [] fruits= {"mango", "apple", "kiwi","pear"};
	    System.out.println(fruits[2]);
	    // fruits[4]="peach"; Java will give out of bounds error.
	    
	    int [] numbers= {1,2,3};
	    System.out.println(numbers[0]);
	    // if we have a lot of elements in our array,
	    // how we can count it?--> length
	    int size=fruits.length;
	    System.out.println(size);
	    
	    System.out.println("-------------------------");
	    char[] word1= {'A','B', 'C', 'D', 'E','F'};
	    for (int i=0; i<word1.length; i++) {
			   System.out.print(word1[i]+" ");}
	    System.out.println();
	    char[] word2= {'s','a', 'y', 'b', 'n','c','t','d','a','e','x'};
	    for (char i=0; i<word2.length; i++) {
        if(i%2==0){
			   System.out.print(word2[i]);}
        }
}
}