package solution.tut8.all;

public class Account {

	private final String username, password;
	
	public Account(String usr, String pwd) {
		this.username = usr;
		this.password = pwd;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + "]";
	}
	
}
