package com.syntaxclass16;

public class Dog {

	static String name; // if something will stay same during the class,
	// we use static
	String color;
	
	public static void main(String[] args) {
		Dog dog1= new Dog();
		dog1.name="Tomy";
		dog1.color= "Pink";
		
		Dog dog2= new Dog();
		dog2.name="Fido";
		dog2.color= "Black";
		
		Dog dog3= new Dog();
		dog3.name="Jajaja";
		dog3.color= "White";
		System.out.println(dog1.name +" "+ dog1.color);
		System.out.println(dog2.name +" "+ dog2.color);
		System.out.println(dog3.name +" "+ dog3.color);// if we create a static variable, it will hold only one 
	}

}
