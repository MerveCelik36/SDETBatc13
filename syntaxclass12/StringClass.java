package com.syntaxclass12;

public class StringClass {

	public static void main(String[] args) {
		
		String name= new String("Oleg");// proper way to create an object
		String name2="Oleg";// shortcut of proper way. those two is the same
    // all the classes in java can be treated as datatype
		// so we create data type inside the datatype
		// if a class present inside the same package or if a class belongs to
		//java.lan package
		name.length();// this is length method
		
		System.out.println(name.length());// oleg has 4 character
		name2="Zameer";
		System.out.println(name2.length());// Zameer has 6 character
		String captain="Naveed";
		System.out.println(captain.toLowerCase());
				
		
	}

}
