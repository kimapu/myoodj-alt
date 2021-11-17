package solution.tut10.q4;

import java.io.Serializable;
import java.util.UUID;

public class Loan implements Serializable{

	private final UUID uid;
	
	public Loan() {
		this.uid = UUID.randomUUID();
	}

	@Override
	public String toString() {
		return "Loan [uid=" + uid + "]";
	}



}
