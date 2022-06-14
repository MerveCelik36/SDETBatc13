package com.syntaxclass06;

public class SwitchStatement {

	public static void main(String[] args) {
		// switch is a keyword ands statement that we 
		/*
		 * switch (variable)
		 * case (value1):
		 * code a;
		 * break;
		 * case (value2):
		 * code b;
		 * break;
		 * case (value3):
		 * code c;
		 * break;
		 */
		// what is switch case: it is a conditional statement. we test a variable against multiple values.
		// we cannot use boolean, double, float or long values.
		// we cannot use logical or relational operators.
		int day=3;
		String name;
		
		if (day == 1) { 
			name="monday";
			}else if ( day==2) {
				name= "Tuesday";
			}else if (day==3) {
				name= "wednesday";
			}else if ( day==4){ 
				name= "Thursday";
			}else { name= "Invalid";
			}
System.out.println(" today is "+ name);
		

	// switch case ;
// switch does not allow to have duplicated cases
	// variable 
	System.out.println("--------------------");
	
    char choice= 'Y';
    String meaning;
    
    switch (choice) {
    case 'Y':
    	meaning="Yes";
    	break;
    case 'M':
    	meaning="Maybe";
    	break;
    case 'N':
    	meaning= "No";
    	break;
    default:
    	meaning= "Unknown";
    	break;
    	
    }









	}
}
	


