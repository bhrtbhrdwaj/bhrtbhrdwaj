package com.training.stringInnerClass;
import static java.lang.System.out;
class MyOuter{
	public void show() {out.println("Showing outer.");}
	class MyInner{
		public void show() {out.println("Showing inner.");}
	}
}


public class InnerDemo {

	public static void main(String[] args) {
	MyOuter outer = new MyOuter();
	MyOuter.MyInner inner = outer.new MyInner();
	outer.show();
	inner.show();
	}

}
