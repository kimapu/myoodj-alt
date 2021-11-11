package faq.fileIO;

import java.util.List;

public class Demo {


	public static void main(String[] args) {
		
//		User u1 = new User();
//		u1.setFirst("ahmad");
//		u1.setLast("puteri");
//		
//		u1.addUsr();
//		System.out.println( ">>> Done." );
		
		User u1 = new User();
		
		List<User> l = u1.getAll();
		
		for (User user : l) {
			System.out.println( user.getFirst() +" : "+ user.getLast());
		}
		
		
		
		
	}

}
