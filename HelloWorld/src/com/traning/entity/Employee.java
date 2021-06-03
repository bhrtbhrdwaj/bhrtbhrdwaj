package com.traning.entity;

import java.util.Scanner;

public class Employee {
private int empId;
private String name;
private double salary;

Employee(){
	
}
Employee(int empId, String name, double salary){
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}

public void showDetails() {
	System.out.println("Employee Id:" + this.empId);
	System.out.println("Employee Name: " + this.name);
	System.out.println("Employee's Salary: " + this.salary);
}

public static void main(String... args) {
	Employee emp = new Employee(24, "Bharat", 10000.0);
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Employee id: ");
	int id = scanner.nextInt();
	System.out.println("Enter Employee's name:");
	scanner.nextLine();
	String name = scanner.nextLine();
	System.out.println("Enter Employee's salary:");
	double sal = scanner.nextDouble();
	
	emp.showDetails();
}
}
