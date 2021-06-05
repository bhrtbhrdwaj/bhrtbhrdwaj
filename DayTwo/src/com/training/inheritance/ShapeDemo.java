package com.training.inheritance;

abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape constructor is called");
		this.color=color;
		
	}
	
	public String getColor() {
		return color;
		
	}
}



class Circle extends Shape{

	double radious;
	
	public Circle(String color,double radious) {
		super(color);
		System.out.println("Circle is called");
		this.radious=radious;
	}
	
	@Override
	double area() {
		
		return Math.PI * Math.pow(radious,2);
	}

	@Override
	public String toString() {
		
		return "Circle color is"+super.getColor()+"And area is "+area();
	}
	
}


class Rectangle extends Shape{
	private int length;
	private int width;

	Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return (this.length * this.width);
	}

	@Override
	public String toString() {
		return "Color is :" + this.color + "Area is: " + this.area();
	}
	
}

public class ShapeDemo {
	
	public static void main(String[] args) {
	
		//Shape s1=new Circle("Red",2.2);
		//System.out.println(s1);
		Shape s = new Rectangle("Red", 10, 10);
		System.out.println(s);
		
	}

}

