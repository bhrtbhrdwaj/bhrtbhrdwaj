

public class Employee{
	private int empId;
	private String name;
	private double salary;
	
	private Address address;
	private DateOfBirth dateOfBirth;
	
	public Employee() {
		this.empId = 0;
		this.name = "";
		this.salary = 0;
		this.address = new Address();
		this.dateOfBirth = new DateOfBirth();
	}
	public Employee(int empId, String name, double salary, Address address, DateOfBirth dateOfBirth) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
}
