package com.training.inheritance;
/*

class Parent{
Parent() {
	System.out.println("Parent constructor is called");
}

 void printData() {
	System.out.println("Parent -> PrintData ");
}
}


class Child extends Parent{
public Child() {
	System.out.println("Child is called");
}


public void printData() {
	System.out.println("Child -> PrintData ");
}
}





public class MethodOverridingExample {

public static void main(String[] args) {
//	Parent o1=new  Parent();
//	o1.printData();
//	
	
	Parent o2=new Child();
	o2.printData();
	
//	
//	Child o3=new Child();
//	o3.printData();
//	
	

}

}

*/
/*
class Parent{
	String name;
	public Parent method() {
		System.out.println("Method of Parent");
	return null;}
}



class Child extends Parent{
	int id;
	@Override
	public Child method() {
		System.out.println("MEthod from Child");
		return null;}
}



public class MethodOverridingExample {
	
	public static void main(String[] args) {
		Parent p=new Child();
		p.name="Tanish";
		
		System.out.println(p.name);
		p.method();
		
		
		Child c=(Child)p;
		c.id=101;
		System.out.println(c.name);
		c.method();
		
		
	}
}
*/


class Machine{
	public void start() {
		System.out.println("Machine is started");
	}
}


class Laptop extends Machine{
	@Override
	public void start() {
		System.out.println("Laptop is started");
	}
	
	public void stop() {
		System.out.println("Laptop is stopped");
	}
}



public class MethodOverridingExample {
	public static void main(String[] args) {
		Machine machine=new Machine();
		machine.start();
		
		Laptop laptop=new Laptop();
		laptop.start();
		laptop.stop();
		
		
		Machine machine1= (Laptop)laptop;
		machine1.start();
		
	}
}
