package com.syntaxclass06;

import java.util.Scanner;

public class EnhancedCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
System.out.println("What month were you born in!");
String month = input.nextLine();

String season;

if (month.equals("March") || month.equals("April") || month.equals("May")) {
season = "Spring";

} else if (month.equals("June") || month.equals("July")
|| month.equalsIgnoreCase("August")) {
season = "Summer";

} else if (month.equals("September") || month.equals("October")
|| month.equals("November")) {
season = "Autumn";

} else if (month.equals("December") || month.equals("January")
|| month.equals("February")) {
season = "Winter";
} else {
season = "Invalid";
}

if (!season.equals("Invalid")) {
System.out.println("You were born in " + season);

	}

	}
}
