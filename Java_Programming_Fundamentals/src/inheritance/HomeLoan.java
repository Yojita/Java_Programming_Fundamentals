package inheritance;

public class HomeLoan extends Loan {
	HomeLoan() {
		tenure = 5;
		principal = 20000;
		interestRate = 8.5f;
		accountNo = "Acc123456";
	}

	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan();
		double amount = homeLoan.calculateEMI();
		System.out.println("EMI per Year : " + amount);
	}
}
