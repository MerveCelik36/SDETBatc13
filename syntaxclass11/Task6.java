package com.syntaxclass11;

public class Task6 {

	public static void main(String[] args) {
		//  Write a program to swap 2 numbers without a temporary variable?
      int a=10;
      int b=20;
      b=10;
      a=20;
      System.out.println(a);
      System.out.println(b);
      // another way
      int c=10;
      int d=20;
      c=c+d ;// 10+20=30
      d=c-d ;//30-20=10		
      c=c-d; //30-10=20
      System.out.println("c= "+c);
      System.out.println("d= "+d);
	}

}
