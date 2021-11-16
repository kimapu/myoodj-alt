package solution.tut8.all;
/**
 * 
 * Assume that a solution class called Login.
 *	
 */
public class Login {

	/**
	 * USERACCOUNT.txt
	 */
	
	public boolean verify(String usr, String pwd) {
		/**
		 * get all useraccount...
		 */
		return usr.equals("admin") && pwd.equals("pwd");
	}

}
