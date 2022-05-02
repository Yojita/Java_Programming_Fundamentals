package polymorphism;

public class HomeLoan extends Loan_1 {
	// method overriden
	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double simpleInterest = (principal * 7.5 * 20) / 100;
		double emi = (simpleInterest + principal) / 20;
		return emi + additionalTax;
	}
}
