package solution.tut6.q2;

public class GeometricObject implements Comparable{

	public int radius;
	public double area;
	
	public GeometricObject() {
	}
	
	public GeometricObject( int radius ) {
		super();
		this.radius = radius;
	}
	
	public String max( GeometricObject shape ) {
		int i = this.compareTo(shape);
		if( i < 1 ) {
			return shape.toString();
		}else {
			return this.toString();
		}
	}
	
	@Override
	public int compareTo(Object o) {
		GeometricObject obj = (GeometricObject)o; //down-casting
		return Double.valueOf( this.area ).compareTo( obj.area );
	}

	@Override
	public String toString() {
		return "GeometricObject [radius=" + radius + ", area=" + area + "]";
	}

}
