package com.training.collection;

class Student implements Comparable<Student>{

	Integer rollNo;
	String name;
	Integer age;
	
	
	public Student(Integer rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Student student) {
	return rollNo.compareTo(student.rollNo);}
	
}

public class ComparableExample {
	public static void main(String[] args) {
		Student s1=new Student(101,"Tanish",23);
		Student s2=new Student(102,"Anish",43);
		Student s3=new Student(103,"Manish",23);
		
		
		if(s1.equals(s1)) {
			System.out.println("Equal");
		}
		
		
	}
	
}


