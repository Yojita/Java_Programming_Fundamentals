package conditionalStatements;

public class Account_5 {
	public static void main(String[] args) {
		double balance = 0;
		double minbal = 500;
		double depositAmt = 0;
		while (depositAmt < minbal) {
			System.out.println("$100 have been added to account");
			depositAmt += 100;
		}
		balance = depositAmt;
		System.out.println("Transaction complete");
	}
}
