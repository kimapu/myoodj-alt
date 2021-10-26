package solution.tut7.demo.one;

public class Fulltimer extends Staff {

	private final double PAY;
	
	public Fulltimer(int workload, double pAY) {
		super(workload, 40);
		this.PAY = pAY;
	}

	@Override
	public void computePay() {
		if( super.workload > super.MAX_HOUR ) super.salary = this.PAY;
	}

	@Override
	public String toString() {
		return "Fulltimer [PAY=" + PAY + ", salary=" + salary + ", workload=" + workload + ", MAX_HOUR=" + MAX_HOUR
				+ "]";
	}

}
