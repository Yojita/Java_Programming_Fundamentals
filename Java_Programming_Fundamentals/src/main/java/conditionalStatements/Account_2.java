package conditionalStatements;

public class Account_2 {
	public static void main(String[] args) {
		double balance = 500;
		System.out.println("Amount to withdraw");
		double amount = 400;
		if (amount <= 0) {
			System.out.println("Withdrawal has failed the amount is negative");
		} else if (amount > balance) {
			System.out.println("Withdrawal has failed as balance is low");
		} else {
			balance -= amount;
			System.out.println("Withdrawal has succeeded");
		}
	}
}
