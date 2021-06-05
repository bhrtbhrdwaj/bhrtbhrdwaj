import java.time.LocalDate;

public class OrgEmpDemo {

	public static void main(String[] args) {
		SalesEmployee saleEmployee = new SalesEmployee
				(1, "A", 12000, 7000, new Address("new street", "Aligarh", "UP"),
						new DateOfBirth(LocalDate.parse("1995-11-01")));
		
		saleEmployee.calSalary();
		
		WageEmployee wageEmployee = new WageEmployee
				(2, "B", 12000, 7000, new Address("old street", "Aligarh", "UP"),
						new DateOfBirth(LocalDate.parse("1993-11-01")), 13, 3, "Jan", 2020);
		
		wageEmployee.calSalary();
		
		

	}

}
