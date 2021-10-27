package solution.tut6.q1;

public class Student extends Person {

	private enum Level{
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
	};
	
	public final Level STATUS;

	public Student(String name, String address, String telno, String email, Level status) {
		super(name, address, telno, email);
		STATUS = status;
	}

	@Override
	public String toString() {
		return "Student [Name=" + super.name + "]";
	}
	
	
	
}
