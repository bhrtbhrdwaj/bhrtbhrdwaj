package com.training.main;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
	private Integer empId;
	private String name;
	private Double salary;
	
	public Employee() {
		this.empId = 0;
		this.name = "";
		this.salary = 0.0;
	}

	public Employee(Integer empId, String name, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}



	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public static void main(String... args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "X", 10000.0));
		empList.add(new Employee(2, "Y", 11000.0));
		empList.add(new Employee(3, "Z", 12000.0));
		empList.add(new Employee(4, "A", 13000.0));
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("1] Add Employee.");
		System.out.println("2] Update.");
		System.out.println("3] Delete.");
		System.out.println("4] Display.");
		
		System.out.println("\n Enter choice: ");
		
		
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1: 
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter Employee Id: ");
			int id = obj.nextInt();
			
			System.out.println("Enter Employee name: ");
			obj.hasNextLine();
			String name = obj.nextLine();
			
			System.out.println("Enter Employee's salary: ");
			double sal = obj.nextDouble();
			
			empList.add(new Employee(id, name, sal));
			out.println("Employee added successfully!");
			
			obj.close();
			break;
		case 2:
			Scanner obj1 = new Scanner(System.in);
			System.out.println("Enter Employee Id to update: ");
			int id1 = obj1.nextInt();
			boolean found = false;
			for(int i = 0; i < empList.size(); i++) {
				if(empList.get(i).getEmpId() == id1) {
					found = true;
					empList.set(i,new Employee(2, "s", 34000.0));
				}
			}
			if(!found) 
				out.println("No Record found");
			
			obj1.close();
			
			break;
		case 3:
			Scanner obj2 = new Scanner(System.in);
			System.out.println("Enter Employee Id to delete: ");
			int id2 = obj2.nextInt();
			boolean found0 = false;
			for(int i = 0; i < empList.size(); i++) {
				if(empList.get(i).getEmpId() == id2) {
					found0 = true;
					empList.remove(i);
					out.println("Employee removed");
				}
			}
			if(!found0)
				out.println("No Record found");
			
			obj2.close();
			
			break;
		case 4:
			Scanner obj3 = new Scanner(System.in);
			System.out.println("Enter Employee Id to display: ");
			int id3 = obj3.nextInt();
			boolean found2 = false;
			for(int i = 0; i < empList.size(); i++) {
				if(empList.get(i).getEmpId() == id3) {
					found2 = true;
					out.println(empList.get(i));
				}
			}
			if(!found2) 
				out.println("No Record found");
			
			obj3.close();
			
			break;
		default: out.println("Wrong Choice!");
				break;
		}
	scanner.close();
	}

}
