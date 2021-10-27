package solution.tut6.q1;

public class Person {

	public String name, address, telno, email;

	public Person(String name, String address, String telno, String email) {
		super();
		this.name = name;
		this.address = address;
		this.telno = telno;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [Name=" + name + "]";
	}
	
	
}
