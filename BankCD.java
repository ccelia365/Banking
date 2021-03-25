package cs520.hw2.part2;

public class BankCD {

	// Instance variables
	private String bankName;
	private int initialDeposit;
	private double rate;
	private int numberOfYears;

	// Constructor initializes name of Bank
	public BankCD(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 
	 * @return bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 
	 * @return initialDeposit
	 */
	public int getInitialDeposit() {
		return initialDeposit;
	}

	/**
	 * Sets initial deposit
	 * 
	 * @param initialDeposit
	 */
	public void setInitialDeposit(int initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	/**
	 * 
	 * @return rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * Sets rate and divide by 100
	 * 
	 * @param rate
	 */
	public void setRate(double rate) {
		this.rate = rate/100;
	}

	/**
	 * 
	 * @return number of years
	 */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/**
	 * Sets the number of years
	 * 
	 * @param numberOfYears
	 */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/**
	 * Calculates the final value
	 * 
	 * @return final Value
	 */
	public double getFinalValue() {
		double fValue;
		fValue = getInitialDeposit() * Math.pow(1+ getRate(), getNumberOfYears());
		return fValue;
	}

	/**
	 *  display result
	 */
	public void printCDDetails() {
		System.out.printf("Bank %s %d-year CD of $%d at %.2f percent rate is worth $%.2f\n", getBankName(), getNumberOfYears(), getInitialDeposit(), getRate()*100, getFinalValue());
	}

}// class
