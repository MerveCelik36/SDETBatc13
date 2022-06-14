package com.syntaxclass12;

public class StringClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="kat";
		String name2="kat";
		System.out.println(name.equals(name2));//true
		name2="KAT";
		System.out.println(name2.equalsIgnoreCase(name2));// true
	}

}
