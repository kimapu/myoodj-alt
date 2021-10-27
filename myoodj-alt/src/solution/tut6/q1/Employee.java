package solution.tut6.q1;

public class Employee extends Person {
	public String office;
	public double salary;
	public MyDate dateHired;
	
	public Employee(String name, String address, String telno, String email, String office, double salary) {
		super(name, address, telno, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + "]";
	}
	
}
