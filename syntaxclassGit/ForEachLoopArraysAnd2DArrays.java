package com.syntaxclassGit;

public class ForEachLoopArraysAnd2DArrays {

	public static void main(String[] args) {
		System.out.println("For Each Loop Array");
		System.out.println("-----------------------");
		/*what is for each loop array:
		 * it is a special kind of loop that
		 * make regular for loop more shorter and easy to understand.
		 * regular for loop holds 3 statement, for each loop
		 * hold only two statement. it start executing elements from first index until 
		 * it reach out last index.(one by one executing.)
		 */
		 char[] word1= {'A','B', 'C', 'D', 'E','F'};
		    for (char i:word1) {
				   System.out.print(i+" ");}
		    System.out.println();
		    char[] word2= {'s','a', 'y', 'b', 'n','c','t','d','a','e','x'};
		    for (char i=0; i<word2.length; i++) {
	        if(i%2==0){
				   System.out.print(word2[i]);}
	        
		   }System.out.println();
		    String[] arr={"This", "is", "array", "of", "strings"};
		    for (String name:arr){
		      System.out.print(name+" ");
		    }
		 System.out.println(); 
	     System.out.println("2-D Arrays");
	     System.out.println("-----------------------");
		   /*2D Array:
		    * we use multi-dimensional array when we have more then one array and make a table
		    * or coordinate from them.there will be multiple square brackets.
		    * for 2D array, we will use 2 of them. first bracket hold row, second bracket hold columns.
		    * while we declare our arrays, there will be an outer curly brackets for holding
		    * inner arrays in it.each array will have separate curly brackets.
		    */
	       int [][] nums= {{1,2,3,4} ,
	    		          {199,300,588},
	                      {1900,4578,98787} };

	        for(int i=0; i<nums.length; i++) {
		    for(int b=0; b<nums[i].length; b++) {
			System.out.print(nums[i][b]+" ");  }
		    System.out.println();}
		    
	}

}
