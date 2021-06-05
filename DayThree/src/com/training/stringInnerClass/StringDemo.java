package com.training.stringInnerClass;
import static java.lang.System.out;
class x{
	x(){
		out.println("x()");
	}
	x(int x){
		this();
		out.println("x(int)");
	}
}
public class StringDemo {

	
	public static void main(String... args) {
	/*	StringBuilder notSync = new StringBuilder("I am not thread safe");
		Thread a = new Thread(() -> {
			try {
				Thread.sleep(4000);
			}catch(InterruptedException e) {
				
			}
			out.println("A is appending");
			notSync.append(" thread A appended");});
		
		
		Thread b = new Thread(() -> {
			out.println("B is appending");
			notSync.append(" thread B appended");});
		
		a.start();
		
		b.start();
		
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			
		}
		out.println("main is appending");
		notSync.append("main");
		out.println(notSync);
		
		
		
		*/
	//x j = new x(10);
	
	StringBuffer sb=new StringBuffer("HEllo");
	sb.append("String");
	
	out.println(sb);
	
	sb.insert(1, "NEW");
	out.println(sb);
	
	
	
	sb.replace(1,3,"JAVA");
	out.println(sb);
	
	
	sb.reverse();
	out.println(sb);
	
	String s1="Hello String";
	char ch[]= {'s','t','r','i','n','g'};
	
	String s2=new String(ch);
	
	String s3=new String("Example string");
	
	out.println(s3.length());
	
	out.println(s3.concat("New STring"));
	
	out.println(s3.indexOf('a'));
	
	out.println(s3.charAt(0));
	
	out.println(s3.hashCode());
	out.println(s3);
	
	}

}
