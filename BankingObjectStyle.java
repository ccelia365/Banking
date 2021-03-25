package cs520.hw2.part2;
import java.util.Scanner;
public class BankingObjectStyle {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		// Asks user for invest amount
		System.out.println("Enter in amount to invest:");
		int investAmount = input.nextInt();

		// Asks user for name of bank which is option 1
		System.out.println("Enter in name of bank: ");
		String bNameA = input.next();

		// Instantiates option 1
		BankCD bank1CD = new BankCD(bNameA);

		// Asks user for number of years provided by option 1
		System.out.printf("Enter number of years the CD is invested for Bank %s:\n", bNameA);
		int bankTermA = input.nextInt();

		// Asks user for interest rate provided by option 1
		System.out.println("Enter as % the interest rate of Bank " + bNameA);
		double bankInterestA = input.nextDouble();

		// Calculates final value for option 1
		bank1CD.setInitialDeposit(investAmount);
		bank1CD.setRate(bankInterestA);
		bank1CD.setNumberOfYears(bankTermA);
		double CDepositsA = bank1CD.getFinalValue();

		// Asks user for name of bank which is option 2
		System.out.println("Enter in name of 2nd bank: ");
		String bNameB = input.next();

		// Instantiates option 2
		BankCD bank2CD = new BankCD(bNameB);

		// Asks user for number of years provided by option 2
		System.out.printf("Enter number of years the CD is invested for Bank %s:\n", bNameB);
		int bankTermB = input.nextInt();

		// Asks user for interest rate provided by option 2
		System.out.println("Enter as % the interest rate of Bank " + bNameB);
		double bankInterestB = input.nextDouble();

		// Calculates final value for option 2
		bank2CD.setInitialDeposit(investAmount);
		bank2CD.setRate(bankInterestB);
		bank2CD.setNumberOfYears(bankTermB);
		double CDepositsB = bank2CD.getFinalValue();

		// Display results of both options
		bank1CD.printCDDetails();
		bank2CD.printCDDetails();

		double difference;

		// Compares both options and outputs results
		if (CDepositsA == CDepositsB) {
			System.out.printf("Bank %s's CD is equal to Bank %s's CD.\n", bank1CD.getBankName(), bank2CD.getBankName());
		}else if (CDepositsA > CDepositsB) {
			difference = CDepositsA - CDepositsB;
			System.out.printf("Bank %s's CD exceeds Bank %s's CD by $%.2f\n", bank1CD.getBankName(), bank2CD.getBankName(), difference);
		} else {
			difference = CDepositsB - CDepositsA;
			System.out.printf("Bank %s's CD exceeds Bank %s's CD by $%.2f\n", bank2CD.getBankName(), bank1CD.getBankName(), difference);
		}

		input.close();

	} // main

} // class
