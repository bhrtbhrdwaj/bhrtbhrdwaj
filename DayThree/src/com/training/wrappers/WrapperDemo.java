package com.training.wrappers;
import static java.lang.System.out;

final class MyFinal{
	
}

class FinalVarAndMethod{
	public static final String MY_TEMPLATE = "Hello!";
	public  final String finalString = "Hello!";
	
	public final void display() {
		//finalString = ""; final string can't be assigned
		out.println("Final display().");
	}
}

class FinalTest extends FinalVarAndMethod{//extends MyFinal{ can't be extended CTE
	
	//public void display() {} cannot override final method CTE
	
}


public class WrapperDemo {

	public static void main(String... args) {
	
		out.println(FinalVarAndMethod.MY_TEMPLATE);
		
		
		
		/*int i = 10;
	Integer j = i; // auto-boxing
	int x = j;// auto-unboxing
	out.println("i :" + i);
	out.println("j :" + j);
	out.println("x :" + x);*/
	} 
}
