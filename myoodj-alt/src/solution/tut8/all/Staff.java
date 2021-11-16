package solution.tut8.all;

public class Staff {

	private final String uid, name, addr, dob, jobRole;
	private Account staffAcc;
	
	public Staff(String uid, String name, String addr, String dob, String jobRole, String username, String pwd) {
		super();
		this.uid = uid;
		this.name = name;
		this.addr = addr;
		this.dob = dob;
		this.jobRole = jobRole;
		this.staffAcc = new Account(username, pwd);
	}

	public Account getStaffAcc() {
		return staffAcc;
	}

	public void setStaffAcc(Account staffAcc) {
		this.staffAcc = staffAcc;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", addr=" + addr + ", dob=" + dob + ", jobRole=" + jobRole + ", staffAcc="
				+ staffAcc + "]";
	}

	/**
	 * create() 
	 */
	public void create() {
		System.out.println(">>> creating staff record...");
		// TODO: write to file...
	}
	
	/**
	 * edit()
	 */
	public void edit() {
		System.out.println(">>> editing staff record...");
		// TODO: write to file...
	}
	
	/**
	 * delete()
	 */
	public void delete() {
		System.out.println(">>> deleting staff record...");
		// TODO: write to file...
	}
	
	
	
	
	
}
