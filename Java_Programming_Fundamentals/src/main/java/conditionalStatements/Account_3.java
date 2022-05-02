package conditionalStatements;

public class Account_3 {
	public static void main(String[] args) {
		int choice = 0;
		choice = 2;
		switch (choice) {
		case 1:
			System.out.println("Entry deposition");
			break;
		case 2:
			System.out.println("Display operation");
			break;
		case 3:
			System.out.println("Deposit operation");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
