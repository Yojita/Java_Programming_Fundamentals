package superKeyword;

public class ExecuteLoan {
	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan();
		System.out.println("Home loan emi per year is : " + homeLoan.calculateEMI(2000000));
	}
}
