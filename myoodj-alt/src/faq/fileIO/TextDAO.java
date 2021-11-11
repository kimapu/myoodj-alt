package faq.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TextDAO extends DAO {

	public TextDAO( String fileName ) {
		super(fileName);
	}

	@Override
	public List<String> readAll() {
		List<String> lst = new ArrayList<>();
		try( BufferedReader in = new BufferedReader( new FileReader( super.file ) ); ) {
			
			String line;
			while( (line= in.readLine()) != null ) {
				lst.add(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public void write( String record ) {

		try( PrintWriter out = new PrintWriter( new FileWriter(super.file, true) ); ) {
				out.println( record );
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
