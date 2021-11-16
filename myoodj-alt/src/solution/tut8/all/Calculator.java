package solution.tut8.all;

public class Calculator {

	private final double d1, d2;

	public Calculator(double d1, double d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}

	public double add() {
		return d1 + d2;
	}
	
	public double sub() {
		return d1 - d2;
	}
	
	public double div() {
		return d1 / d2;
	}
	
	public double mul() {
		return d1 * d2;
	}
	
}
