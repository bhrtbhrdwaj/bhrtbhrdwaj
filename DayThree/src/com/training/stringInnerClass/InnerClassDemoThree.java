package com.training.stringInnerClass;
/*
class Demo{
	void show() {
		System.out.println("Show method demo class");
	}
}

class Flavor1Demo{
	
	static Hello h=new Hello() {

		@Override
		public void show() {
			System.out.println("show method from Flvour1 is called");
			
		}
		
	};
	
	*/
	
//	static Demo d=new Demo() {
//		void show() {
//			super.show();
//			System.out.println("Flavor1.demo.show");
//		}
//	};
//}
/*

interface Hello{
	void show();
}





public class InnerClassDemoThree {
public static void main(String[] args) {
	Flavor1Demo.h.show();
	
}
}
*/
public class InnerClassDemoThree {
	
	static int a=10;
	static int b;
	
	static {
		System.out.println("static block is called");
		b=a*4;
	}
	

	public static void main(String[] args) {
		System.out.println("Main block");
		System.out.println("A"+a);
		System.out.println("B"+b);

	}

}
