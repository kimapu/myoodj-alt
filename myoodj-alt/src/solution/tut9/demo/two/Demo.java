package solution.tut9.demo.two;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Demo {

	static 
	{
		//arr-object
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = Math.abs(new Random().nextInt());
		}
		
		//write-to-file
		writeTo( arr, new File( Global.contextPath+"ints.txt") );
	}
	
	public static void main(String[] args) {
		
		/**
		 * Prompt the user to read the content from the file...
		 */
		Scanner scan = new Scanner( System.in );
		String fileName;
		do {
			System.out.println( "Enter filename: [ints.txt]" );
			fileName = scan.next();
		} while ( !fileName.equalsIgnoreCase("ints.txt") );
		System.out.println( ">> Reading is being processed!" );
		readFrom( fileName );
		
	}

	static void readFrom( String fileName ) {
		System.out.println(">>> File Content...");
		/**
		 * BufferredReader
		 */
		try( BufferedReader in = new BufferedReader( new FileReader( Global.contextPath+fileName) );	 ) {
			
			String line;
			while( (line = in.readLine() ) != null ) {
				System.out.println( line );
				TimeUnit.SECONDS.sleep(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void writeTo( int[] arr, File path ) {
		/**
		 * PrintWriter
		 */
		try( PrintWriter out = new PrintWriter( new FileWriter(path) ); ) {
			
			for (int i = 0; i < arr.length; i++) {
				out.println( String.valueOf(arr[i]).substring(0, 2) ); //write-operation
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//System.out.println("\nDone!");
		}
		
	}
	
}
