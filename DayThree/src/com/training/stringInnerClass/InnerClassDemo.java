package com.training.stringInnerClass;

class Outer{
	void outerMethod() {
		int x=100;
		System.out.println("Outer method is called");
		class Inner{
			void innerMethod() {
				System.out.println("Inner method is called"+x);
			}
		}
		
		Inner y=new Inner();
		y.innerMethod();
	}
	
}


public class InnerClassDemo {
public static void main(String[] args) {
	Outer o=new Outer();
	o.outerMethod();
}
}