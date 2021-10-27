package solution.tut6.q2;

public class Circle extends GeometricObject{

	public Circle( int radius ) {
		super(radius);
		super.area = Math.PI * Math.pow(radius, 2); //A=PIr2
	}

}
