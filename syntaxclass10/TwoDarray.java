package com.syntaxclass10;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to create 2D array we specify # of rows and colons=size
		int [][]numbers= new int [3][4];
		//1. row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2. row
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][3]=4;
		//3. row
		
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][3]=6;
		int rows=numbers.length;// gives #of 1d arrays
		System.out.println("Number of rows= "+ rows);
		int col0f1row= numbers[0].length;
		System.out.println("number of colums in 1. row is= "+ col0f1row);
		
		/*create 2d array of states
		 * 1 array--> NY-->all cities of NY states
		 * 2 array--> CA-->all cities of CA states
		 * 3 array--> FL-->all cities of FL states
		 * 4 array--> VA-->all cities of VA states
		 */
		
		String[][] usa= {
		     	{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Francisco", "San Jose", "San Diego","Redding"},
				{"Miami", "Orlando","Niceville", "Tampa"},
				{"McLean","Richmond", "Leesburg"}
		};
		System.out.println(usa[1][2]);// San Jose

        System.out.print("I wanna go "+ usa[2][0]);
		System.out.println("Total number of 1d in usa: "+usa.length);
		// i want to see how many elements inside my first array
		int elementsarray=usa[0].length;
		System.out.println("# of elements in first array= "+elementsarray);
		
		
	    



System.out.println("All values using enhanced for loop");
// outer loop iterates over rows
// inner loop iterates over columns


  



int arr[][]={{1,2,3},{2,4,5},{4,4,5}};

//printing 2D array
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
 System.out.print(arr[i][j]+" ");
}}

		
	}

}
