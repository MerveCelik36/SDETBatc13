package com.syntax.class03;

public class Practise {

	public static void main(String[] args) {
		int num=30;
		num+=50;// --> num=num+50
		System.out.println(num);//80
		num-=20; //-->num= num-20
		System.out.println(num);//60
		num/=2;
		System.out.println(num);//30
		int num1=20;
		int num2=10;
		int result1, result2;
		
		result1=(num1/num2);
		result2=(num1%num2);
		System.out.println(result1);//2
		System.out.println(result2);//0
	}

}
