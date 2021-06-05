package com.training.stringInnerClass;

class Student{
	String name;
	int rollNo;
	static String cllgName;
	
	
	static int counter=0;
	
	
	public Student(String name) {
		this.name=name;
		this.rollNo=setRollNo();
	}
	
	static int setRollNo() {
		counter++;
		return counter;
	}
	
	
	static void setCllgName(String name) {
		cllgName=name;
	}
	
	void showStudentInfo() {
		System.out.println("NAme"+this.name);
		System.out.println("Roll no"+this.rollNo);
		System.out.println("col name"+cllgName);
	}
	
}



public class StaticExample {

	
	public static void main(String[] args) {
		Student.setCllgName("ABC");
		
		Student s1=new Student("EShan");
		Student s2=new Student("Tanish");
		
		s1.showStudentInfo();
		s2.showStudentInfo();
	}
}

