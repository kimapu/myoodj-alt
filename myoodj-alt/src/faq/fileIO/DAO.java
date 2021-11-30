package faq.fileIO;

import java.io.File;
import java.util.List;

public abstract class DAO {

	protected File file;
	
	public DAO( String fileName ) {
		this.file = new File( fileName );
	}
	
	public abstract List<String> readAll();
	
	public abstract void write( String record, boolean append );

	public abstract void modify( List<String> newLst );
}
