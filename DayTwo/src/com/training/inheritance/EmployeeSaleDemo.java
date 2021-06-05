package com.training.inheritance;

public class EmployeeSaleDemo {
	public static void main(String... args) {
		SalesEmployee s1 = new SalesEmployee(1, "x", 2300, 300, 2700);
		System.out.println(s1);
		System.out.println(s1.calculateSalary());
	
	}
}
