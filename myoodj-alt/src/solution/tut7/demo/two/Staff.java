package solution.tut7.demo.two;

public abstract class Staff extends Employee implements Payable {

	protected double salary;

	public Staff(int workload, int mAX_HOUR) {
		super(workload, mAX_HOUR);
	}

	public double getSalary() {
		return salary;
        }
        
        
}
