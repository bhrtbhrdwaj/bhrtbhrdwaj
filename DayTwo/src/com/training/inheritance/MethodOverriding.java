package com.training.inheritance;


class Abc{
	public Abc() {
		System.out.println("Abc is called");
	}
	public void show() {
		System.out.println("show method from Abc");
		
	}
}

class Xyz extends Abc{
	public Xyz() {
		System.out.println("Xyz is called");
	}
	
	public void show() {
		System.out.println("show method from Xyz");
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		Abc x=new Xyz();
		x.show();

	}

}

