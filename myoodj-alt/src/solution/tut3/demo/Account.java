package solution.tut3.demo;

/**
 * 
 * @author kimlee
 * 
 * 	Demo: Transform the given Account class in UML to the Java class...
 *	
 *	Modifier/visibility/accessibility: public, private, protected, package-private (default)
 *	
 *	OOP: Encapsulation -> private/protected
 */

public class Account extends Object
{

	//data-compartment
	private int id;
	private double balance, annualInterestRate;
	
	//constructor-method -> 
		//purpose	: 	construct/instantiate/create/make the object instance of the class
		//task		:	initialise values to the instance members of the object
	public Account() {} //no-arg constructor
	
	//overloaded contructor
//	public Account( int id ) {
//		this.id = id;
//	}
	
	//operation-compartment
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId( int id ) {
		this.id = id;
	}
	
	public void setBalance( double balance ) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate( double rate ) {
		this.annualInterestRate = rate;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public void withdraw( double amount ) {
		this.balance -= amount;
	}
	
	public void deposit( double amount ) {
		balance += amount;
	}
	
	//convert the object to the String representation
	@Override
	public String toString() {
		String header = " \n>>> Account >>> \n";
		return header + this.getId() + ": " + this.getBalance();
	}
	
}
