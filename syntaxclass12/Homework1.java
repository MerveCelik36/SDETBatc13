package com.syntaxclass12;

public class Homework1 {

	public static void main(String[] args) {
		/* Create a String and if the String is not empty perform the following: 
		if the String has an odd number of characters and has 3 or more characters,
		print the character in the middle of the String.
		*/
		int middle=0;
          String cat= "Sasha is my lovely cat.";
          if (!cat.isEmpty()) {
        	 if (cat.length()%2!=0 &&  cat.length()>=3){
        		 middle=cat.length()/2;
        	 
        	 System.out.println(cat.charAt(middle));}}
          else {System.out.println("String is empty");}
        
          
          
	}

}
