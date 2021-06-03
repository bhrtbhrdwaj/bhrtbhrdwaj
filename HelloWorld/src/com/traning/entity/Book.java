package com.traning.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
	
	
	private String name;
	private String author;
	private double price;
	private int qty;
	
	public Book(String name, String author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public void showBookDetails() {
		System.out.println("Book Title: " + this.name);
		System.out.println("Author: " + this.author);
		System.out.println("Quantity: " + this.qty);
		System.out.println("Price: " + this.price);
	}

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Book title: ");
		String name = scanner.nextLine();
		System.out.println("Enter Author's name:");
		String author = scanner.nextLine();
		System.out.println("Enter Quantity:");
		int qty = scanner.nextInt();
		System.out.println("Price: ");
		double price = scanner.nextDouble();
		*/
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("A", "x", 12, 10));
		bookList.add(new Book("B", "y", 11, 11));
		bookList.add(new Book("C", "z", 10, 1));
		bookList.add(new Book("D", "j", 9, 3));
		bookList.add(new Book("E", "k", 8, 5));
		
		
		for(Book book : bookList) {
			book.showBookDetails();
		}
		
		
	}

}
