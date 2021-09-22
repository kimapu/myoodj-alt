package solution.tut2.demo;

public class Converter {

	//One foot is 0.305 meters.
	//constant variable
	
	//final keyword to mark the variable as a constant
	final double ONE_METER = 0.305;
	
	//toMeter(double) : double
	public double toMeter( double footValue ) {
		return footValue * ONE_METER;
	}
	
	
}
