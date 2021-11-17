package solution.tut10.q4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String path = "src/solution/tut10/q4/LOAN.bin";
		int option;
		do {
			System.out.println(">>> Choose option:");
			System.out.println( "1) Read Loan File" );
			System.out.println( "2) Write Loan File" );
			System.out.println( "\nYour option? " );
			option = new Scanner(System.in).nextInt();
			switch (option) {
				case 1: 
					{
						Loan[] loanLst = from( path, new Loan[5] );
						try {
							for (Loan loan : loanLst) {
								System.out.println( loan );
							}
						} catch(NullPointerException e) {
							System.out.println( "File not found!" );
						}
					}
					break;
				case 2:
					to( path, new Loan[] { new Loan(), new Loan(), new Loan(), new Loan(), new Loan() } );
					break;
				
			}
			System.out.println();
		}while( option > 0 && option < 3 );
		System.out.println("\n>>> Exit...");
		
	}
	
	static Loan[] from( String path, Loan[] loanLst ) {
		
		if( !new File(path).exists() ) {
			return null;
		}else {
			try( ObjectInputStream in = new ObjectInputStream( new FileInputStream( path ) ) ) {
				
				for (int i = 0; i < loanLst.length; i++) {
					loanLst[i] = (Loan)in.readObject();
				}
				return loanLst;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
			}
		}
		
		
	}
	
	static void to( String path, Loan[] loanLst ) {
		try( ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( path ) ) ) {
			
			for (Loan loan : loanLst) {
				out.writeObject( loan );	
			}
			System.out.println("Done...");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
