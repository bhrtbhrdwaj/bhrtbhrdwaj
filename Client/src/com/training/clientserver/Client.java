package com.training.clientserver;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String... args) {
	try {
		Socket s=new Socket("localhost",6666);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("HelloServer");
		dout.flush();
		dout.close();
		s.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}
}
