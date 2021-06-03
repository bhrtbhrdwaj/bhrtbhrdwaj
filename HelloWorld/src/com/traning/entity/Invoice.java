package com.traning.entity;

import java.util.Scanner;

public class Invoice {

	private int invoiceId;
	private String description;
	private int qty;
	private double unitPrice;
	
	public Invoice(int invoiceId, String description, int qty, double unitPrice) {
		this.invoiceId = invoiceId;
		this.description = description;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		double total = this.qty * unitPrice;
		return total;
	}
	
	public void showInvoice() {
		System.out.println("Invoice Id: " + this.invoiceId);
		System.out.println("Description: " + this.description);
		System.out.println("Quantity: " + this.qty);
		System.out.println("Unit Price: " + this.unitPrice);
		System.out.println("Total " + this.getTotal());
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Invoice id: ");
		int id = scanner.nextInt();
		System.out.println("Enter Description:");
		scanner.nextLine();
		String des = scanner.nextLine();
		System.out.println("Enter Quantity:");
		int qty = scanner.nextInt();
		System.out.println("Unit Price:");
		double unitPrice = scanner.nextDouble();
		
		
		Invoice invoice = new Invoice(id, des, qty, unitPrice);
		invoice.showInvoice();

	}

}
