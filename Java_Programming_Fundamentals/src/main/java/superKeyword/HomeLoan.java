package superKeyword;

public class HomeLoan extends Loan {
	HomeLoan() {
		super(5, 8.5f); // invoking super class constructor
	}

	public double calculateEMI(double principal) {
		double simpleInterest = (principal * interestRate * tenure) / 100;
		double emi = (simpleInterest + principal) / tenure;
		int additionalTax = 200;
		return emi + additionalTax;
	}
}
