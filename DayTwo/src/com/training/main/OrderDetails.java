package com.training.main;

import java.util.ArrayList;
import java.util.List;

public class OrderDetails {
	
	private String custName;
	private String custAddress;
	private List<Product> custProducts;
	private double billAmount;
	
	


	public OrderDetails() {
		custName="";
		custAddress="";
		custProducts=new ArrayList<Product>();
		billAmount=0;
	}

	public OrderDetails(String custName, String custAddress, List<Product> custProducts) {
		this.custName = custName;
		this.custAddress = custAddress;
		this.custProducts = custProducts;
		this.billAmount =0;
	}

	
	public void generateBillAmount() {
		double total = 0;
		for(Product p: custProducts) {
			total += p.getPrice();
		}
		billAmount = total;
	}

	@Override
	public String toString() {
		return "OrderDetails [custName=" + custName + ", custAddress=" + custAddress + ", custProducts=" + custProducts
				+ ", billAmount=" + billAmount + "]";
	}

	public static void main(String[] args) {
		
		
		OrderDetails o1=new OrderDetails();
		System.out.println(o1);
		
		List<Product> orderColl=new ArrayList<Product>();
		orderColl.add(new Product("Salt 1 pkt", 23.00));
		orderColl.add(new Product("Aata 10 kg", 23.00));
		orderColl.add(new Product("Onion 10kg", 23.00));
		
		
		
		
		OrderDetails o2 = new OrderDetails("TAnish Mishra","Mumbai",orderColl);
		o2.generateBillAmount();
		System.out.println(o2);

	}

}
class Product{
	private String productName;
	private double price;
	
	Product(){
		
	}
	Product(String productName, double price){
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + "]";
	}
	
	
	
}