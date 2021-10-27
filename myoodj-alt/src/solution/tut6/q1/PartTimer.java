package solution.tut6.q1;

public class PartTimer extends Staff {

	public int workedHour;

	public PartTimer(String name, String address, String telno, String email, String office, double salary,
			String title, int workedHour) {
		super(name, address, telno, email, office, salary, title);
		this.workedHour = workedHour;
	}

	@Override
	public String toString() {
		return "PartTimer [Name=" + name + "]";
	}
	
	
	
}
