package polymorphism;

public class Loan {
	private float interest;

	Loan() {
		interest = 8.5f;
	}

	public double calculateEMI(int tenure, double principal) {
		double simpleInterest = (principal * tenure * interest) / 100;
		return (simpleInterest + principal) / tenure;
	}

	public double calculateEMI(double principal, int tenure) {
		double simpleInterest = (principal * tenure * interest) / 100;
		return (simpleInterest + principal) / tenure;
	}

	public double calculateEMI(int tenure, double principal, float interest) {
		double simpleInterest = (principal * tenure * interest) / 100;
		return (simpleInterest + principal) / tenure;
	}

	public static void main(String[] args) {
		Loan loan = new Loan();

		System.out.println("EMI per year is : " + loan.calculateEMI(20000d, 5));
		System.out.println("EMI per year is : " + loan.calculateEMI(5, 20000d));
		System.out.println("EMI per year is : " + loan.calculateEMI(5, 20000, 9.5f));
	}

}
