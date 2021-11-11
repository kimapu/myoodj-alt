package faq.fileIO;

import java.util.ArrayList;
import java.util.List;

public class User {

	private final String PATH = "src/faq/fileIO/";
	private TextDAO dao = new TextDAO( PATH+"user.txt" );
	
	//data-attr
	private String first, last;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.join("|", first, last);
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	/**
	 * function-operation
	 */
	public void addUsr() {
		dao.write( this.toString() );
	}
	
	public List<User> getAll() {
		List<String> usrLst = dao.readAll();
		
		List<User> lst = new ArrayList<>();
		
		for (String str : usrLst) {
			String[] split = str.split("\\|");
			User usr = new User();
			usr.setFirst(split[0]);
			usr.setLast(split[1]);
			lst.add( usr );
		}
		
		return lst;
	}
	
	

}
