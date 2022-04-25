package polymorphism;

public class ExecuteLoan {
	public static void main(String[] args) {
		Loan_1 loan_1 = null;
		loan_1 = new HomeLoan(); // runtime polymorphism
		double hloan = loan_1.calculateEMI(2000000);
		loan_1 = new VehicleLoan();
		double vloan = loan_1.calculateEMI(100000);
		System.out.println("Home loan emi per year is : " + hloan);
		System.out.println("Vehicle loan emi per year is : " + vloan);
	}
}
