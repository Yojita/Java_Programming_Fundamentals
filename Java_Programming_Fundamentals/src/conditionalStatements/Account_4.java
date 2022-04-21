package conditionalStatements;

public class Account_4 {
	public static void main(String[] args) {
		double balance = 0;
		double minbal = 500;
		double depositAmt = 0;

		do {
			System.out.println("$100 have been added to the account");
			depositAmt += 100;
		} while (depositAmt < minbal);
		balance = depositAmt;
		System.out.println("Transaction Complete");
	}
}
