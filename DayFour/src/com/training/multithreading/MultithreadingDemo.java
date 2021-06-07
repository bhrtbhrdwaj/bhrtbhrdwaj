package com.training.multithreading;
import static java.lang.System.out;

class MyThread extends Thread{
	
	
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		out.println("run() from MyThread class \n" 
				+ "Name: " + this.getName() + "Priority: " + this.getPriority());
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		out.println("run() from MyRunnable");
	}
}
//-------------------------------
class TableOf{
	private int x;
	TableOf(int x){
		this.x = x;
	}
	public synchronized void calTable(int from, int to) {
		for(int i = from; i <= to; i++) {
			try { Thread.sleep(1000);}catch(InterruptedException e) {}
			out.println(this.x + "*" + i + "=" + i*this.x);
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
}

class TableFromOne extends Thread{
	TableOf x;
	TableFromOne(TableOf x){
		this.x = x;
	}
	@Override
	public void run() {
		x.calTable(1, 5);
		
	}
}

class TableFromFive extends Thread{
	TableOf x;
	TableFromFive(TableOf x){
		this.x = x;
	}
	@Override
	public void run() {
		x.calTable(6, 10);
	}
}




public class MultithreadingDemo {

	public static void main(String... args) {
	
	/*	MyThread customThread = new MyThread("MyThread");
		customThread.setPriority(Thread.MAX_PRIORITY);
		
		Thread threadWithRunnable = new Thread(new MyRunnable(), "MyRunnable");
		
		Thread lambdaThread = new Thread(() -> out.println("run() from lambda"));
		lambdaThread.setPriority(Thread.NORM_PRIORITY);
		
		customThread.start();
		threadWithRunnable.start();
		lambdaThread.start(); */
	TableOf table = new TableOf(2);
	Thread one = new Thread(new TableFromOne(table));
	Thread two = new Thread(new TableFromFive(table));
	one.start();
	
	two.start();
		
		
	}
	
	
	

}
