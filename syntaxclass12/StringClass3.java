package com.syntaxclass12;

public class StringClass3 {

	public static void main(String[] args) {
		String str=" Batch 13 is Great";
		System.out.println(str.startsWith("Frozen"));//false
		System.out.println(str.endsWith("t"));//true
		System.out.println(str.endsWith("Great"));//true
		System.out.println(str.toLowerCase().endsWith("great"));//true
		System.out.println(str.endsWith("great"));//false
		
		String name="HAMID";
		System.out.println(name.toLowerCase());
		
		System.out.println(str.contains("13"));//true
		System.out.println(str.contains("is"));//true
		System.out.println(str.toLowerCase().contains("batch"));//true
	
		
		
		
		
	}

}
