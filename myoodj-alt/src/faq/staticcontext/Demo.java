package faq.staticcontext;

/**
 * 
 * @author kimlee
 *
 *	whts the difference between these sir

	public static void
	
	public void
	
	static void

 * 	>>> Modifier and static context...
 */

public class Demo {

	//java keyword: 
		//Modifier/visibility	: 	public, private, protected, package-private (default)
		//static context		:	static 
			//Explanation: with static keyword, the member belongs to the class
						 //without static keyword, the member belongs to the object instance	
		//constant				:	final

	//static context can be applied to the member of the class
		//member refer to the data or operation
	
	//operation or method
	public static int add( int i, int j ) { //belongs to the class
		return i + j;
	}
	
	public int minus( int i, int j ) { //belongs to the object instance
		return i - j;
	}
	
	public static void main(String[] args) {
		
		int result1 = Demo.add(10, 20);
		//int result2 = Demo.minus(10, 20); //invalid becos static context issue...
		int result2 = new Demo().minus(10, 20); //valid
		
		
	}
	
}








