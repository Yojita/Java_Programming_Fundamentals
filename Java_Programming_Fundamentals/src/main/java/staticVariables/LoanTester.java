package staticVariables;

public class LoanTester {
	public static void main(String[] args) {
		Loan l1 = new Loan();
		System.out.println("Counter : " + l1.getLoanCounter());
		Loan l2 = new Loan();
		System.out.println("Counter : " + l2.getLoanCounter());
		
		Loan loan3 = new Loan(1001, 10, 152.25f, 2, 12.5f);
		System.out.println("Counter : " + loan3.getLoanCounter());
		
		Loan loan4 = new Loan(1002, 11, 125.2f, 3, 12.3f);
		System.out.println("Counter : " + loan4.getLoanCounter());
	}
}
