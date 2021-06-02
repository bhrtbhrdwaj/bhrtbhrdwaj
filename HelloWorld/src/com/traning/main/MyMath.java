package com.traning.main;

import java.util.Scanner;

public class MyMath {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a four digit number: ");
	int num = scanner.nextInt();
	int placeValue = 1;
	int digit;
	int sum = 0;
	while(num != 0) {
		digit = num % 10;
		sum += digit;
		num = num /10;
		System.out.print(digit * placeValue + "+");
		placeValue *= 10;
	}
	System.out.println("\nSum of digits is: " + sum);
	/*System.out.println("Enter first value: ");
	int valFirst = scanner.nextInt();
	
	System.out.println("Enter second value: ");
	int valSecond = scanner.nextInt();
	
	System.out.println("Addtion is: " + (valFirst + valSecond));
	System.out.println("Subtraction is: " + (valFirst - valSecond));
	System.out.println("Multiplication is: " + (valFirst * valSecond));
	System.out.println("Division is: " + (valFirst/ valSecond));
	*/
	scanner.close();
		
		
	
	}

}
