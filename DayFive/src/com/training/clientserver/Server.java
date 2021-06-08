package com.training.clientserver;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
		public static void main(String[] args) throws IOException {
			try {
				ServerSocket ss=new ServerSocket(6666);
				System.out.println("Waiting for clients....");
				Socket s=ss.accept(); //establish connection
				
				DataInputStream dis=new DataInputStream(s.getInputStream());

				String str=(String)dis.readUTF();
				System.out.println(str);
				ss.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}


		}

}

