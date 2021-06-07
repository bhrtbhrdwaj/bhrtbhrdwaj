package com.training.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo {

	public static void main(String[] args) {
		File file = new File("output.txt");
		try {
			
			byte bwrite[]= {10,20,30,40,50};
			OutputStream os=new FileOutputStream(file);
			os.write(bwrite);
			
			os.close();
			
			byte x[] = new byte[5];

			FileInputStream in=new FileInputStream(file);
			in.read(x);
			for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);}
			
			System.out.println("Size of file: " + file.length());
			
			in.close();


		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}


    }