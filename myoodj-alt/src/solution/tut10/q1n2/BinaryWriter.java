package solution.tut10.q1n2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Inheritance concept
 * 	Child class
 *
 */
public class BinaryWriter extends IO{

	public BinaryWriter(String fileName) {
		super(fileName);
	}
	
	/**
	 * write() : void
	 */
	public void write( int[] ints ) {
		writeInObject(ints);
	}
	
	private void writeInNumber(int[] ints) {
		/**
		 * DataOutputStream
		 */
		try( DataOutputStream out = new DataOutputStream( 
				new FileOutputStream(super.getFileName(), true) );
			) {
			for (int i = 0; i < ints.length; i++) {
				out.writeDouble( ints[i] );
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void writeInObject(int[] ints) {
		/**
		 * ObjectOutputStream
		 */
		try( ObjectOutputStream out = new ObjectOutputStream( 
				new FileOutputStream(super.getFileName(), true) ); ) {
			out.writeObject(ints);
			System.out.println("Done...");
		} catch(IOException e) {
			// TODO: handle exception
		}
	}
	
}
