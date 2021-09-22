package solution.tut2.demo;

public class Cylinder {
	
	/**
	 * 	area = radius * radius * PI
		volume = area * length
	 */

	//calcArea( double ) : double
	public double calcArea( double radius ){
		return Math.PI * Math.pow(radius, 2);
	}
	
	//calcVolume( double, double ) : double
	public double calcVolume( double radius, double length ){
		return calcArea( radius ) * length;
	}
	
}
