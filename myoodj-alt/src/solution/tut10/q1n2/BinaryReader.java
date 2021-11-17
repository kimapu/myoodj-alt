package solution.tut10.q1n2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Inheritance concept
 * 	Child class
 *
 */
public class BinaryReader extends IO {

	public BinaryReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}


	/**
	 * read() : int[]
	 */
	public int[] read() {
		return readOutObject();
	}
	
	private int[] readOutObject() {
		/**
		 * ObjectInputStream
		 */
		try( ObjectInputStream in = new ObjectInputStream( new FileInputStream(super.getFileName()) ); ) {
			return (int[])in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
