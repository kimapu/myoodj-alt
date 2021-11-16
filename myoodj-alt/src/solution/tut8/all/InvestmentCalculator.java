package solution.tut8.all;

public class InvestmentCalculator {

	private double amount, rate;
	private int yr;

	public InvestmentCalculator(double amount, double rate, int yr) {
		super();
		this.amount = amount;
		this.rate = rate;
		this.yr = yr;
	}

	public double futureValue() {
		return amount * Math.pow(1+rate, yr*12);
	}

}
