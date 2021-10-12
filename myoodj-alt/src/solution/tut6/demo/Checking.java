package solution.tut6.demo;

public class Checking extends GeneralAccount {

	private final double LIMIT_RATE = 0.1; 
	
	public Checking() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdraw( double amount ) {
		double curr_balance = super.getBalance(); //1000
		double total_withdrawal_amount = curr_balance + (curr_balance * LIMIT_RATE); //1000+100
		if( amount > 0 && total_withdrawal_amount > amount  )
			super.withdraw(amount);
		else
			System.out.println( "Invalid: Withdraw Amount!" );
		
	}

}
