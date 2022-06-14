package com.syntaxclass08;

public class Homework3 {
	public static void main(String[] args) {
		
		//Using nested loop, create a 24 hour clock that will display 2 digits for an hour and 2 digits for a minute.
		/*Example:

			*10:00

			*10:01

			*10:02

			*…..etc

			*10:59

			*11:00

			*……etc
			*/
		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 3; b++) {
				for (int c = 0; c <= 5; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + ":" + c + "" + d);
	}

				}
			} 
}
		
		
		
		
		
	}
	
}