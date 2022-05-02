package operators;

public class AND_Operator {
	public static void main(String[] args) {
		double balance = 2000;
		System.out.println("Amount to withdraw");
		double amount = 500, limit = 10000, minbal = 500;
		if(amount <= limit && (balance - amount) > minbal) {
			balance -= amount;
			System.out.println("Withdrawal has succeeded");
		}
	}
}
