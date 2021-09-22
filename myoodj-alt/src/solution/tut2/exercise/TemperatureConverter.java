package solution.tut2.exercise;

/**
 * 
 * @task for group15
 * 
 */

public class TemperatureConverter {

	// mingfai
	// toCel( double ) : double
	public double toCelsius(double fahrenheit) {
		return fahrenheit - 32 * 5 / 9;
	}

	// changhau
	// toFah( double ) : double
	public double toFah(double celcius) {
		return celcius * 9 / 5 + 32;
	}
	
}
