package com.training.collection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Employee
{
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public int getAge() 
	{
		return age;
	}

	public String getGender() 
	{
		return gender;
	}

	public String getDepartment() 
	{
		return department;
	}

	public int getYearOfJoining() 
	{
		return yearOfJoining;
	}

	public double getSalary() 
	{
		return salary;
	}

	@Override
	public String toString() 
	{
		return "Id : "+id
				+", Name : "+name
				+", age : "+age
				+", Gender : "+gender
				+", Department : "+department
				+", Year Of Joining : "+yearOfJoining
				+", Salary : "+salary;
	}
}

public class CollectionExample {
	public static void main(String[] args)throws Exception {
		
		Stack<Employee> employeeList = new Stack<Employee>();

		employeeList.push(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.push(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.push(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.push(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.push(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.push(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.push(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.push(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.push(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.push(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.push(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.push(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.push(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.push(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.push(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.push(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.push(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		File out = new File("employees");
		FileWriter writer = new FileWriter(out);
		
		
		Iterator<Employee> itr=employeeList.iterator();
		
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
			writer.append(e.toString());
		}
		writer.flush();
		writer.close();
		/*LinkedList<String> al=new LinkedList<String>();
		al.add("Anish");
		al.add("tanish");
		al.add("rupesh");
		al.add("Paresh");
		
		
		System.out.println(al);
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
	}
}