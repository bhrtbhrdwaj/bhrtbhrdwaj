
public class SalesEmployee extends Employee implements OrgMethods{
	public SalesEmployee() {
		super();
		this.sale = 0;
	}
	public SalesEmployee(int empId, String name, double salary,
			int sale, Address address, DateOfBirth dateOfBirth) {
		super(empId, name, salary, address, dateOfBirth);
		this.sale = sale;
	}
	
	
	
	@Override
	public void acceptEmployeeDetails() {
		
		
	}
	@Override
	public void calSalary() {
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
		System.out.println("Salary : " + netSalary);
	}



	private int sale;
	
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
	
		@Override
	public String toString() {
		return "SalesEmployee [sale=" + sale + "]";
	}
	
}
