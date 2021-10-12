package solution.tut6.demo;

public class GeneralAccount {

	/**
	 * we encapsulate the data members using private keyword
	 * and then, we also provide the accessor/mutator (get/set) methods
	 */
	private long number;
	private double balance, annualInterestRate;
	
	/**
	 * accessor methods
	 */
	public long getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/**
	 * mutator methods
	 */
	public void setNumber(long n) {
		this.number = n;
	}
	
	public void setBalance(double bal) {
		this.balance = bal;
	}
	
	public void setAnnualInterestRate(double rate) {
		this.annualInterestRate = rate;
	}
	
	public GeneralAccount() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * functions for transactions
	 */
	public void deposit( double amount ) {
		balance += amount;
	}
	
	public void withdraw( double amount ) {
		balance -= amount;
	}

	
	
}
