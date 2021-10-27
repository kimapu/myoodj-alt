package solution.tut7.q1;

public class MovableCircle implements Movable {

	private int radius;
	private MovablePoint center;
	
	public MovableCircle( int x, int y, int xSpeed, int ySpeed, int radius ) {
		center = new MovablePoint( x, y, xSpeed, ySpeed ); //composition rel
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub

	}

}
