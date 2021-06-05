package com.training.stringInnerClass;

class Job{
	
	private int id;
	private String role;
	private long salary;
	
	
	public Job() {
		id=0;
		role="";
		salary=0;
	}


	public Job(int id, String role, long salary) {
		
		this.id = id;
		this.role = role;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Job [id=" + id + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
}


class Person{
	private String name;
	private Job job;   ///Containment object
	
	public Person() {
		name="";
		job=new Job();
	}
	
	public Person(String name, Job job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}	
}








public class ContainmentExample {
	public static void main(String[] args) {
		Person p=new Person("Eshan",new Job(101,"HR",34455));
		
		System.out.println(p);
		
		
		
		
	}
}

