package solution.tut9.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Demo {


	public static void main(String[] args) {
		List<EntityItem> data = get( "dummy.dat" );
		
		System.out.println( data.get(0).getItem1() );
		
	}
	
	static List<EntityItem> get( String fileName ) {
		List<EntityItem> lst = new ArrayList<>();
		String path = "src/solution/tut9/demo/"+fileName;
		/**
		 * BufferedReader
		 */
		if( new File(path).exists() ) {
			//try(Scanner scan = new Scanner( path ) ) {
			try( BufferedReader scan = new BufferedReader( new FileReader(path) ); ) {
				String line;
				while( (line = scan.readLine()) != null ) { //NOT-EOF
					String[] split = line.split("\\,");
					lst.add( new EntityItem( split[0], split[1], split[2], split[3] ) );
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println( "File not found!" );
		}
		return lst;
		
	}
	
}
