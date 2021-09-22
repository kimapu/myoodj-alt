package client.cli.exercise.group17;

import java.util.Scanner;

import solution.tut2.exercise.ASCIICoder;

public class App {

	static Scanner scan = new Scanner( System.in );
	
	public static void main(String[] args) {
		
		runASCIICoder();
		
	}
	
	/**
	 * runASCIICoder()
	 */
	static void runASCIICoder() {
		ASCIICoder ac = new ASCIICoder();
		System.out.println("Enter code[0-128]: ");
		int code = scan.nextInt();
		//check
		if( code >= 0 && code <= 128 ) {
			char c = ac.getChar( code );
			System.out.println( ">>> "+ code + ": " + c  );
		}else {
			System.out.println(">>> Invalid input!");
		}
		
	}
}
