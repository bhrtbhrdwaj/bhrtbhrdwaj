package com.training.filehandling;
import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class FileReadWrite {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		out.println("Enter something:");
		String line = scanner.nextLine();
		try {
		File file = new File("demo.txt");
		
		FileOutputStream outFile = new FileOutputStream(file);
		outFile.write(line.getBytes());
		out.println("Wrote success.");
	
		byte[] str = new byte[line.length()];
		FileInputStream inFile = new FileInputStream(file);
		out.println(inFile.read(str));
		out.println(new String(str) );
	
		
		outFile.close();
		scanner.close();
		}catch(Exception e) {
			
		}
	}

}
