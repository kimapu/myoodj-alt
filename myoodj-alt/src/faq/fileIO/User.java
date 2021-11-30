package faq.fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class User {

	private final String PATH = "src/faq/fileIO/";
	private TextDAO dao = new TextDAO(PATH + "user.txt");

	// data-attr
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
		dao.write(this.toString(), true);
	}

	public List<User> getAll() {
		List<String> usrLst = dao.readAll();

		List<User> lst = new ArrayList<>();

		for (String str : usrLst) {
			String[] split = str.split("\\|");
			User usr = new User();
			usr.setFirst(split[0]);
			usr.setLast(split[1]);
			lst.add(usr);
		}

		return lst;
	}

	public boolean editUser(String id, String newRecord) {
		boolean isEdited = false;
		// getAll, find target line, write back
		List<String> userLst = dao.readAll();

		List<String> tempLst = new ArrayList<>();
		for (String line : userLst) {
			if (line.startsWith(id)) { // find
				tempLst.add(newRecord);
			} else {
				tempLst.add(line);
			}
		}
		// updated records in tempLst
		dao.modify(tempLst);

		isEdited = true;
		return isEdited;

	}

	public static void main(String[] args) {
		String id = "micheal";
		String newName = "maryjohnmick"; //TF.getText();
		String newLine = String.join("|", id, newName );
		User usr = new User();
		boolean updated = usr.editUser(id, newLine);
		System.out.println(updated);
	}

}
