package com.training.inheritance;


class simpleadd
{
	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum="+c);			
	}
	void add(float a,float b)
	{
		float c;
		c=a+b;
		System.out.println("sum="+c);		
	}
	void add(double a,double b)
	{
		double c;
		c=a+b;
		System.out.println("sum="+c);		
	}
}

public class Simple
{
	public static void main(String[] args)
	{
		simpleadd c1=new simpleadd();
		int a=10,b=20;
		float x=10.5f,y=20.3f;
		double x1=10.50,y1=20.50;
		
		c1.add(a,b);
		c1.add(x,y);
		c1.add(x1,y1);
		
		
	}
	
}
