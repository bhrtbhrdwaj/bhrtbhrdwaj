package com.training.inheritance;

class circle
{
	void calarea(float p,float q)
	{
		float cir;
		System.out.println("value of p "+p);
		System.out.println("value of q "+q);
		cir=p*q*q;
		System.out.println("area of circle="+cir);
	}
	
	void calarea(int l,int b)
	{
		int r;
		r=l*b;
		System.out.println("value of l="+l);
		System.out.println("value of b="+b);
	
		System.out.println("area of rectangle="+r);
		
	}
}



public class Calculate
{
	public static void main(String[] args)
	{
		circle c1=new circle();
		float a=3.12f;
		int b=10;
		c1.calarea(a,b);
		int x=20,y=30;
		c1.calarea(x,y);
		
	}
}

