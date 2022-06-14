package com.syntaxclass12;

public class StringClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sameer is funny Sameer is gulbadan and he is sheer badan";
		
		System.out.println(str.charAt(2));// m
		System.out.println(str.charAt(5));//r
		System.out.println(str.charAt(6));// empty
		int counter=0;
 		for (int i=0; i<str.length(); i++) {
			if ('s'== str.charAt(i)|| 'S'==str.charAt(i)|| 'a'==str.charAt(i)|| 'A'== str.charAt(i)) {
				counter++;
			}
		}System.out.print(counter);

	}

}
