package com.syntaxclass16;

public class GoogleEmployees {
	
	String name;// instance because we will give different value on different object during the same class
	double salary;
	static int noOfEmployees;
	static String companyName= "Google";// because it will stay all the same during the same class
	
	void displayEmployeeInfo() {
		System.out.println("Name "+ name+" Salary is  "+ salary+" Company name "+ companyName+ " Total employees "+noOfEmployees);
		
	}
    
	public static void main(String[] args) {
		GoogleEmployees emp1 = new GoogleEmployees();
		emp1.name= "Oleg";
		emp1.salary= 250000;
		emp1.noOfEmployees=1;
		emp1.displayEmployeeInfo();
		GoogleEmployees emp2 = new GoogleEmployees();
		emp1.name= "Sameer";
		emp1.salary= 250001;
		emp1.noOfEmployees=2;
		emp1.displayEmployeeInfo();
	

	}

}
