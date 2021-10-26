package solution.tut7.demo.one;


public class Demo1 {

	private static Staff worker;
	
	public static void main(String[] args) {
		
		//Fulltimer object testing...
		worker = new Fulltimer(45, 5000.0);
		show(worker); //before compute salary
		worker.computePay();
		show(worker);
		
		System.out.println();
		
		//Partimer object testing...
		worker = new Partimer(45);
		show(worker); //before compute salary
		worker.computePay();
		show(worker);
		
		System.out.println();
		
		//Assistant object testing...
		Employee emp = new Assistant(2);
		System.out.println(emp);
		
	}
	
	static void show(Staff staff) {
		if ( Fulltimer.class.isInstance(staff) ) {
			System.out.println(">>> FullTimer salary: "+staff.getSalary());
		} else if ( Partimer.class.isInstance(staff) ) {
			System.out.println(">>> PartTimer salary: "+staff.getSalary());
		}else {
			System.out.println( staff );
		}
	}
	
}
