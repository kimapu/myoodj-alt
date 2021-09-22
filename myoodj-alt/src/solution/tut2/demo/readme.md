	PRIMITIVE DT:
	 *  byte(8bit), short(16bit), int(32bit), long(64bit)
	 *  float(32bit), double(64bit)
	 *  char
	 *  
	 *  String
	
	void demo() {
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		
		float f = 1.1F; //by default, floating number is treated as double typed
		double d = 1.1;
	}

	
	 * OO-App design - Separate of concerns: 
	  			   1) GUI/CLI is being packaged as one separately.
	  			   2) Solution model class is being packaged in another one.
	
	
	
	 * Visibility/Accessibility (Encapsulation)
	 	public; private; package; package-private
	