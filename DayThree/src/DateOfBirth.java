import java.time.LocalDate;

public class DateOfBirth {
	private LocalDate dob;
	

	public DateOfBirth() {
		super();
	}

	public DateOfBirth(LocalDate dob) {
		super();
		this.dob = dob;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "DateOfBirth [dob=" + dob + "]";
	}
	
}
