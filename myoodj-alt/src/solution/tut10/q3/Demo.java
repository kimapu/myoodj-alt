package solution.tut10.q3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {

	public static void main(String[] args) {
		String path = "src/solution/tut10/q3/";
		String fileName = path+"q3.bin";
		
		tst1( fileName );
		tst2( fileName );
	}
	
	static void tst2(String path) {
		
		try( ObjectInputStream in = new ObjectInputStream( new FileInputStream( path ) ); ) {

			int[] ints = (int[])in.readObject();
			for (int i : ints) {
				System.out.print( i + " " );
			}
			System.out.println( "\n"+(LocalDateTime)in.readObject() );
			System.out.println( in.readDouble() );

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void tst1(String path) {
		
		try( ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( path ) ); ) {
			
			out.writeObject(new int[] {1,2,3,4,5});
			out.writeObject(LocalDateTime.now());
			out.writeDouble(5.5);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
