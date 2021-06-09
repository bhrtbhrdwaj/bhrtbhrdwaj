package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Employee{
	private String name;
	private Double salary;
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
	
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class StringUtils {
public static void main(String... args) {
	List<Employee> employees = new ArrayList<>();
	employees.add(new Employee("Sameer", 10000.0));
	employees.add(new Employee("Rajat", 8000.0));
	employees.add(new Employee("Rahul", 8000.0));
	employees.add(new Employee("Simar", 5000.0));
	employees.add(new Employee("Bharat", 6000.0));
	
	
	employees.stream().filter((emp) -> emp.getName().startsWith("S")).
	forEach(System.out::println);
	System.out.println("Highest salary");
	
	List<Employee> sorted = employees.stream().
			sorted((e1, e2)->e2.getSalary().compareTo(e1.getSalary())).collect(Collectors.toList());
	System.out.println(sorted.get(0));
}
}
