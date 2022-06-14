package com.syntaxclass12;

public class Test {
	public static void main (String[]args) {
	
	
	int array_variable[][] = { { 1, 2, 3 },  
	                           { 4, 5, 6 },
	                           { 7, 8, 9 } };
      int sum4=0;
	

	for (int i = 0; i < 3; ++i) {

	   for (int j = 0; j < 3; ++j) {

	       sum4 = sum4 + array_variable[i][j]; //i=0;sum=0+1+2++3=6
	                                           //i=1;sum=6+4+5+6=21
                                               //i=2; sum=21+7+8+9=
	   }

	}

	System.out.print(sum4 / 5);//9
	System.out.println("==================================");
	int[] array = { 1, 4, 3, 6, 8, 2, 5 };

	int what = array[0];

	for (int index = 0; index < array.length; index++) {

	       if (array[index] > what) {//array[0]=1 what=1
	    	                         //array[1]=4 what=4
	    	                         //array[2]=3 what=4
	    	                         //array[3]=6 what=6
	    	                         //array[4]=8 what=8
	    	                         //array[5]=2 what=8
	    	                         //array[6]=5 what=8

	                  what = array[index];

	        }

	}

	System.out.println(what);
	System.out.println("=======================================");
	int[] zip = new int[5];

	zip[0] = 7;
	zip[1] = 3;
	zip[2] = 4;
	zip[3] = 1;
	zip[4] = 9;

	System.out.println( zip[ 2 + 1 ] );
	System.out.println("========================");
	int count = 0;
	while (count++ < 10) {
	System.out.println("Welcome to Java");
	}
	System.out.println("===========================");

	int k=3, tot=0;

	do{

	   tot=tot+k;

	   k++;

	} while(k<11);

	System.out.print(tot);
	System.out.println("========================");
	int x=1;

	do{

	   x++;

	   System.out.print(x);

	}while(x<5);
	System.out.println("===========================");
	int z=2, sum42=0;

	while(z<9) {

	   z++;

	   sum42=sum42+z;

	}

	System.out.print(sum42);
System.out.println("===========================");
int m=2, total=0;

while(m<6) {

   total=total+m;

   m++;

}

System.out.print(total);
System.out.println("====================");
int nums[] = { 12, 15, 16, 17, 19 };

for (int i = nums.length-1; i >0; i--) {

   System.out.println(nums[i]);

 }
System.out.println("=======================");
int[] a = {12, 15, 11, 13, 9, 25};
int[] a2 = {12, 15, 11, 13, 9, 25};
int sum3 = 0;
for (int i = 0; i <a.length; i++) {
         if (a[i] % 2== a2[i ] % 5)  {
                  sum3 += i * i;
         }
}
System.out.println("sum3 = " + sum3);


System.out.println("======================");
int num3[] = { 12, 15, 16, 17, 19 };

for (int i = num3.length-1; i >0; i--) {

   System.out.println(num3[i]);

 }

}}