package solution.tut7.demo.one;
/**
 * 
 * @author kimlee
 *
 * @implNote
 * 	dummy class
 */
public class Sample1 extends Employee{

	/**
	 * Visibility:
	 *  Java keyword	UML notation
	 * 	private 			-
	 *  public 				+
	 *  protected			#
	 *  package-private		~
	 * 
	 */
	
	/**
	 * final keyword is used to declare constant variable
	 * 	- value can never changed after assigned
	 * 
	 * super keyword is  used to reference to the super-type with the present "extends"
	 * 
	 */
	
	public Sample1(int workload, int mAX_HOUR) {
		super(workload, mAX_HOUR);
		// TODO Auto-generated constructor stub
	}
	
	void m1() {
		
		System.out.println( super.workload ); 
		System.out.println( super.MAX_HOUR );
		
	}
	
	
}
