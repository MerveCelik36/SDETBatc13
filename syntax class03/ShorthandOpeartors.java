package com.syntax.class03;

public class ShorthandOpeartors {

	public static void main(String[] args) {
		
    int num=100;
    num= num+100;
    		System.out.println(num);//200
    num= num+50; // num artik burada 200 cunku java bastan sona calisiyor ve biz num'a yeni bir value koyduk.
    System.out.println(num);//250
    num +=100; // num=num+100
    num-=10; // num=num-10
    System.out.println(num);//340
    num/=10;
    num*=2;
    System.out.println(num);//68
    num%=2;
    System.out.println(num);//0
    int a=10;
    int b= 20;
    int c= 30;
    a+=b;// we add b to a or a=a+b
    System.out.println(a);// 30
    a+=b+c;
    System.out.println(a);// 80
    
    a*=10;
    System.out.println(a);// 800
    a/=20;
    System.out.println(a); //40
   
    
    
    // task
    System.out.println("//task");
    
    
    int box1= 10;
    box1+=500;
    box1+=200;
    int box2= 20;
    box2-=60;
    int cakePiece=11;
    cakePiece/= 4;
    
    int cake=25;
    cake%=7;
    System.out.println(box1);
    System.out.println(box2);
    System.out.println(cakePiece);
    System.out.println(cake);
    
    
    
    
    		
    		
    
	}

}
