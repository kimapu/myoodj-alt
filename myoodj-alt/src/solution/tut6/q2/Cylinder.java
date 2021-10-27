package solution.tut6.q2;

public class Cylinder extends GeometricObject{

	public int height;
	
	public Cylinder( int radius, int height ) {
		super(radius);
		this.height = height;
		//A = 2PIrh + 2PIr2
		super.area = (2 * Math.PI * super.radius * this.height) + 
				(2 * Math.PI * Math.pow(radius, 2));
	}

}
