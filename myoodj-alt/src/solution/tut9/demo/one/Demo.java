package solution.tut9.demo.one;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		int size = 100;
		
		/**
		 * Random class to generate random number or Math.random()
		 * arr
		 */
		//arr-object
		int[] arr = new int[size]; //w/ capacity of 100 so index 0-99
		for (int i = 0; i < size; i++) {
			arr[i] = Math.abs(new Random().nextInt());
		}
		
		//show(arr, 100);
//		try {
//			display( arr, 101 );
//		} catch (Exception e) {
//			System.out.println( "Out of Bound!" );
//		}
		
		try {
			print( new int[0], 0 );
		} catch (Exception e) {
			System.out.println( e.getMessage() );
		}
		
	}
	
	static void print( int[] arr, int size ) throws Exception{
		/**
		 * check if the arr is empty
		 */
		if( arr.length > 0 ) {
			for (int i = 0; i < size; i++) { 
				System.out.println( arr[i] ); 
			}
		}else {
			//Empty-array
			throw new Exception("Empty array!"); //programmatically generate the Exception event
		}
		
		
	}
	
	static void display( int[] arr, int size ) throws ArrayIndexOutOfBoundsException {
		/**
		 * Not handled!
		 */
		for (int i = 0; i < size; i++) { 
			System.out.println( arr[i] ); 
		}
	}
	
	static void show( int[] arr, int size ) {
		/**
		 * ArrayIndexOutOfBoundsException handler!
		 */
		try {
			for (int i = 0; i < size; i++) { //0<101 ... 100<101
				System.out.println( arr[i] ); //arr[100]
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println( "Out of Bound!" );
		}finally {
			System.out.println("\nDone!");
		}
		
	}
	
	
}
