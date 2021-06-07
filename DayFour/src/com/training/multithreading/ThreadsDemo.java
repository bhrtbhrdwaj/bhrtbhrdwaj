package com.training.multithreading;

//threads are multiple flows of control within a single program or
//process.

/**
* Threaded demo application, as a Threads subclass.
*/
public class ThreadsDemo extends Thread {
String mesg;
int count;
/** Run does the work: print a message, "count" number of times */
public void run( ) {
while (count-- > 0) {
println(mesg);
try {
Thread.sleep(100); // 100 msec
} catch (InterruptedException e) {
return;
}
}
println(mesg + " all done.");
}
void println(String s) {
System.out.println(s);
}
/**
* Construct a ThreadsDemo1 object.
* @param String m Message to display
* @param int n How many times to display it
*/
public ThreadsDemo(String m, int n) {
count = n;
mesg = m;
setName(m + " runner Thread");
}
/**
* Main program, test driver for ThreadsDemo1 class.
*/
public static void main(String[] argv) {
// could say: new ThreadsDemo1("Hello from X", 10).run( );
// could say: new ThreadsDemo1("Hello from Y", 15).run( );
// But then it wouldn't be multi-threaded!
new ThreadsDemo("Hello from X", 10).start( );
new ThreadsDemo("Hello from Y", 15).start( );
}
}
