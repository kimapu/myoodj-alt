package solution.tut7.demo.one;

public abstract class Employee {

	protected int workload;
	protected final int MAX_HOUR;
	
	public Employee(int workload, int mAX_HOUR) {
		super();
		this.workload = workload;
		MAX_HOUR = mAX_HOUR;
	}
	
}
