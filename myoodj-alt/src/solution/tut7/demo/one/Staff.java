package solution.tut7.demo.one;

public abstract class Staff extends Employee {

	protected double salary;

	public Staff(int workload, int mAX_HOUR) {
		super(workload, mAX_HOUR);
	}
	
	//abstract method
	public abstract void computePay();

	public double getSalary() {
		return salary;
	}
	
}
