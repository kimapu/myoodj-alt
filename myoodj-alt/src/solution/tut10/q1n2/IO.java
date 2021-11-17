package solution.tut10.q1n2;
/**
 * Inheritance concept
 * 	Parent class
 *
 */
public class IO {

	/**
	 * Encapsulate the fileName using private keyword
	 */
	private final String fileName;

	public IO(String fileName) {
		super();
		this.fileName = fileName;
	}

	protected String getFileName() {
		return fileName;
	}
	
}
