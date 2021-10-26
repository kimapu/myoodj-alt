package solution.tut7.demo.one;

public class Assistant extends Employee {

	public Assistant(int workload) {
		super(workload, 2);
	}

	@Override
	public String toString() {
		return "Assistant [workload=" + workload + ", MAX_HOUR=" + MAX_HOUR + "]";
	}

}
