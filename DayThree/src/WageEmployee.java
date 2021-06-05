
public class WageEmployee extends Employee implements OrgMethods{
private int noOfWorkingHrs;
private int day;
private String month;
private int year;

public WageEmployee() {
	super();
	this.noOfWorkingHrs = 0;
	this.day = 0;
	this.month = "";
	this.year = 0;
	
}
public WageEmployee(int empId, String name, double salary,
		int sale, Address address, DateOfBirth dateOfBirth, int noOfWorkingHrs, 
		int day, String month, int year) {
	super(empId, name, salary, address, dateOfBirth);
	this.noOfWorkingHrs = noOfWorkingHrs;
	this.day =day;
	this.month = month;
	this.year = year;
}



@Override
public void acceptEmployeeDetails() {
}

@Override
public void calSalary() {
	
	int workingDays = 28;
	double perDaySalary, perHrsSalary, totalSal;
	if(month.equalsIgnoreCase("Jan") || month.equalsIgnoreCase("Mar")) {
		workingDays = 31;
	}
	if(month.equalsIgnoreCase("Apr") || month.equalsIgnoreCase("Jun")) {
		workingDays = 30;
	}
	
	perDaySalary = super.getSalary() / workingDays;
	perHrsSalary = perDaySalary / 8;
	
	totalSal = (perHrsSalary * this.noOfWorkingHrs) * workingDays;
	
	System.out.println("Total Salary: " + totalSal);
}


public int getNoOfWorkingHrs() {
	return noOfWorkingHrs;
}
public void setNoOfWorkingHrs(int noOfWorkingHrs) {
	this.noOfWorkingHrs = noOfWorkingHrs;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "WageEmployee [noOfWorkingHrs=" + noOfWorkingHrs + ", day=" + day + ", month=" + month + ", year=" + year
			+ "]";
}




}
