package com.training.inheritance;

interface MyInterface{
	public void method1();
	public void method2();
}


class Demo implements MyInterface{

	@Override
	public void method1() {
		System.out.println("method 1 from demo");
		
	}

	@Override
	public void method2() {
		System.out.println("method 2 from demo");
		
	}
	
}



public class InterfaceExample {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.method1();
		d1.method2();

	}

}

