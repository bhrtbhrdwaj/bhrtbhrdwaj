package com.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee0{
	int empId;
	String name;
	double salary;
	String gender;
	int age;
	public Employee0(int empId, String name, double salary,String gender,int age) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.gender=gender;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", gender=" + gender + "+"+age+"]";
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class StreamExample {
	private static Employee0[] arrayOfEmps= {
		new Employee0(101,"Tanish", 100000,"Male",34),
		new Employee0(102, "Anish", 220000,"Male",45),
		new Employee0(103, "Paresh", 40000,"Male",32),
		new Employee0(104, "Minal", 50000,"FeMale",23),
		
	};
	
	private static List<Employee0> empList=Arrays.asList(arrayOfEmps);
	
	public static void main(String[] args) {
		empList.stream();
		System.out.println(empList);
		
		empList.stream()
		.map(Employee0::getName)
		.distinct()
		.forEach(System.out::println);
		
		
		
		Map<String,Double> avgAgeOfMaleAndFemale=empList.stream().collect(Collectors.groupingBy(Employee0::getGender,Collectors.averagingInt(Employee0::getAge)));
		
		System.out.println(avgAgeOfMaleAndFemale);
		
		
		Optional<Employee0> highestPaidEmployee=empList.stream().collect(Collectors.maxBy((Comparator.comparingDouble(Employee0::getSalary))));
		
		Employee0 e1=highestPaidEmployee.get();
		
		System.out.println(e1.getName());
		
		
		
		
	}
}

