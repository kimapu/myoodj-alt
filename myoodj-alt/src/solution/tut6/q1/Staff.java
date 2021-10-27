package solution.tut6.q1;

public class Staff extends Employee {
	public String title;

	public Staff(String name, String address, String telno, String email, String office, double salary, String title) {
		super(name, address, telno, email, office, salary);
		this.title = title;
	}


	@Override
	public String toString() {
		return "Staff [Name=" + name + "]";
	}
	
	
}
