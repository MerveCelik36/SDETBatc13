package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		int num1=20;
		int num2=22;
		System.out.println(num1> num2);// false
		System.out.println(num1< num2);// true
		System.out.println(num1!= num2);// true
		// == equality assignment
		System.out.println(num1==num2);// no, false burada num1 num2'ye esit mi dedik yok dedi
		System.out.println(num1=num2);//22 burada diyoruz ki num1'i num2 ya esitledik
		System.out.println(num1==num2);// yes, true. cunku yukarida num1'i num2'ye esitledik.
		
        // if we look for the int result, we need to use boolean type of variable
		boolean result=100>200;// rsultlar bundan sonra hep boolean type olacak
		System.out.println(result);// false
		int result1= 100+200; // sadece toplama var int olur.
		System.out.println(result1); //300
		String result2= "emre"+10;// "emre var o yuzden non primitives oldugu icin string
			System.out.println(result2);//emre10
			int num3=10;
			int num4= 11;
			result= num3==num4;
			System.out.println(result);// false cunku esit degiller
			result= num3!=num4;// "!" has not meaning here. it says check if num3 not equal to num4
			System.out.println(result);// true cunku num3 esit degil num4 dogru.
			
			
			
					
			
		
		
		

	}

}
