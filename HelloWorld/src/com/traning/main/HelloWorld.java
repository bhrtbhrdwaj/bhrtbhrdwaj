
package com.traning.main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args)throws Exception {
		//String name = System.console().readLine();
		//System.out.println("Name is: " + name);
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//String anotherName = reader.readLine();
		
		//System.out.println("Another name is: " + anotherName);
		
		//Scanner scanner = new Scanner(System.in);
		//String line = scanner.nextLine();
		
		//System.out.println("Line is: " + line);
		//scanner.close();
		
		//String optionString = JOptionPane.showInputDialog("Enter your name: ");
		
		//JOptionPane.showMessageDialog(null, optionString, "Info" ,JOptionPane.INFORMATION_MESSAGE);
		
		Console console = System.console();
		char[] password = console.readPassword();
		
		System.out.println("Password is: " + password);
	}

}
