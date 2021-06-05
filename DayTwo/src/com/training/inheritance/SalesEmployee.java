package com.training.inheritance;

public class SalesEmployee extends Employee{
	public SalesEmployee() {
		super();
		this.sale = 0;
		this.netSalary = 0;
	}
	public SalesEmployee(int empId, String name, double salary, int sale, double netSalary) {
		super(empId, name, salary);
		this.sale = sale;
		this.netSalary = netSalary;
	}
	private int sale;
	private double netSalary;
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public double calculateSalary() {
		double netSalary = 0;
		double comm = 0;
		if(this.sale < 5000) {
			comm = super.getSalary() * 0.002;
		}else if(this.sale >= 5000 & this.sale < 7000) {
			comm = super.getSalary() * 0.005;
		}else if(this.sale >= 7000 & this.sale < 10000) {
			comm = super.getSalary() * 0.007;
		}else if(this.sale >= 10000) {
			comm = super.getSalary() * 0.010;
		}

		netSalary= super.getSalary() + comm;


		return netSalary;
	}
	
	@Override
	public String toString() {
		return "SalesEmployee [sale=" + sale + ", netSalary=" + netSalary + "]";
	}
	
}
