package solution.tut7.demo.two;


public class Demo2 {

	private static Payable worker;
	
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
	
	static void show(Payable staff) {
		if ( Fulltimer.class.isInstance(staff) ) {
                        Fulltimer ftr = (Fulltimer)staff;
			System.out.println(">>> FullTimer salary: "+ftr.getSalary());
		} else if ( Partimer.class.isInstance(staff) ) {
                        Partimer ptr = (Partimer)staff;
			System.out.println(">>> PartTimer salary: "+ptr.getSalary());
		}else {
			System.out.println( staff );
		}
	}
	
}
