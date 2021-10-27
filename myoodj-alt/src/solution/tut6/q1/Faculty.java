package solution.tut6.q1;

public class Faculty extends Employee {

	public String officeHour;
	public int rank;
	
	public Faculty(String name, String address, String telno, String email, String office, double salary,
			String officeHour, int rank) {
		super(name, address, telno, email, office, salary);
		this.officeHour = officeHour;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty [Name=" + name + "]";
	}
	
	
	
}
