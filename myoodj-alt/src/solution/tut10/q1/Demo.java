package solution.tut10.q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class Demo {


	public static void main(String[] args) {
		
		//tst1();
		
		tst2();
		
	}
	
	static void tst2() {
		String path = "src/solution/tut10/q1/";
		String fileName = path+"binaryints.bin";
		
		File file = new File(fileName);
		try {
		
			if( !file.exists() ) {
//				System.out.println( "//FileNotFound" );
				throw new FileNotFoundException("File not found!");
			}else {
				BinaryReader br = new BinaryReader(fileName);
				int[] ints = br.read();
				for (int i : ints) {
					System.out.print( i + " ");
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println( e.getMessage() );
		}
		
		
	}
	
	static void tst1() {
		//generate 100 ints and store in array
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100); //create rand 0-100
		}
		//write 
		String path = "src/solution/tut10/q1/";
		String fileName = path+"binaryints.bin";
		
		BinaryWriter bw = new BinaryWriter(fileName);
		bw.write(arr);
		
	}

}
