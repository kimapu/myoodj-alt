package solution.tut7.demo.one;

public class Partimer extends Staff {

	private final double RATE = 5.0;
	
	public Partimer(int workload) {
		super(workload, 6);
	} 

	@Override
	public void computePay() {
		// TODO Auto-generated method stub
		super.salary = (super.workload - MAX_HOUR) * RATE;
	}

	@Override
	public String toString() {
		return "Partimer [RATE=" + RATE + ", salary=" + salary + ", workload=" + workload + ", MAX_HOUR=" + MAX_HOUR
				+ "]";
	}

}
