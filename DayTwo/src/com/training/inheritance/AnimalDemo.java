package com.training.inheritance;


abstract class Animal{
	
	public abstract void animalSound(); //unimplemented method

	
	public void sleep() {    	//implemented method
		System.out.println("Slip method from Animal Abstract class");
	}
}


class Tiger extends Animal{

	@Override
	public void animalSound() {
		System.out.println("Animal sound from Tiger class");
		
	}
	
}


public class AnimalDemo {
	
	public static void main(String[] args) {
		Animal a=new Tiger();
		a.animalSound();
		a.sleep();
		
	}

}
