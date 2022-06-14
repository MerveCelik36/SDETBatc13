package com.syntaxclass05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		int height= input.nextInt();
		
		if (height >= 60 && height<= 72) {System.out.println( " Person is avarage");
		}
        if (height>= 72 ) {System.out.println( "person is taller then others");
        }
        else if (height <60) {System.out.println( "person is shorter then the others");
        }
	}

}
