package com.traning.main;

import java.util.Scanner;

public class MethodExample {

	public void add() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int valFirst = scanner.nextInt();
		
		System.out.println("Enter second value: ");
		int valSecond = scanner.nextInt();
		
		System.out.println(valFirst + valSecond);
		scanner.close();
		
	}
	public void sub(int a, int b) {
		System.out.println("Sub is: " + (a - b));
	}
	public int multi(){ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int valFirst = scanner.nextInt();
		
		System.out.println("Enter second value: ");
		int valSecond = scanner.nextInt();
		scanner.close();
		return (valFirst * valSecond);}
	public int div(int a, int b) { 
		return (a/b);}
	
	public static void main(String[] args) {
	
		MethodExample methodExample = new MethodExample();
		Scanner scanner = new Scanner(System.in);
		
		char ch='y';
		do
		{
		
		System.out.println("1] Addition.");
		System.out.println("2] Subtraction.");
		System.out.println("3] Multiplication.");
		System.out.println("4] Division.");
		
		System.out.println("\n Enter choice: ");
		
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1: 
			methodExample.add();
			break;
		case 2:
			System.out.println("Enter first value: ");
			int valFirst = scanner.nextInt();
			
			System.out.println("Enter second value: ");
			int valSecond = scanner.nextInt();
			methodExample.sub(valFirst, valSecond);
			break;
		case 3:
			System.out.println(methodExample.multi());
			break;
		case 4:
			System.out.println("Enter first value: ");
			int valF = scanner.nextInt();
			
			System.out.println("Enter second value: ");
			int valS = scanner.nextInt();
			System.out.println(methodExample.div(valF, valS));
			break;
		default: System.out.println("Wrong Choice!");
				break;
			
				
		}
		System.out.println("Do you want to continue.....");
		
		
		
		ch=scanner.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
	if(ch=='n'||ch=='N') {
		System.out.println("Thank you visit again");
	}
		
		
		scanner.close();
		
	}

}
