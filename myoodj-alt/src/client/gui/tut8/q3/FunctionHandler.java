package client.gui.tut8.q3;

import solution.tut8.all.MileKmConverter;

public class FunctionHandler {
	
	public String doConvert( String action, String n ) throws Exception{
		String r = null;
		switch ( action.toLowerCase() ) {	
			case "tokilo": 
				r = String.valueOf( MileKmConverter.toKM( n ) );
				break;
			case "tomile": 
				r = String.valueOf( MileKmConverter.toMile( n ) );
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " +  action.toLowerCase() );
		}
		return r;
	}

}
