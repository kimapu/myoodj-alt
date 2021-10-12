package solution.tut6.demo;

/**
 * @implNote
 * 	inheritance is coded with the keyword extends
 *
 */

public class Savings extends GeneralAccount {

	public Savings() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * polymorphism concept - overriding method deposit to the GeneralAccount class (superclass)
	 */
	@Override
	public void deposit( double amount ) {
		System.out.println( "Savings - deposit("+amount+")" );
		super.deposit(amount);
	}
	
	@Override
	public void withdraw( double amount ) 
	{
		double curr_balance = super.getBalance();
		if( amount > 0 && curr_balance > amount  )
			super.withdraw(amount);
		else
			System.out.println( "Invalid: Withdraw Amount!" );
	}

}
