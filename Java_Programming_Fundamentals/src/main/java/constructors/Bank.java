package constructors;

public class Bank {
	private String bankName;
	private String area;
	private String phoneNo;

	Bank() { // Default Constructor
		bankName = "IBank";
		area = "Gandhi Nagar";
		phoneNo = "958651221";
	}

	Bank(String bName, String bArea, String bPhoneNo) {
		bankName = bName;
		area = bArea;
		phoneNo = bPhoneNo;
	}

	void displayDetails() {
		System.out.println("Bank Name : " + bankName);
		System.out.println("Area of Bank : " + area);
		System.out.println("Phone number of Bank : " + phoneNo);
	}

	public static void main(String[] args) {
		Bank bank1 = new Bank(); // call default constructor
		Bank bank2 = new Bank("IBank", "Gandhi Nagar", "54564312145"); // call parameterized constructor
		bank1.displayDetails();
		System.out.println("*********************");
		bank2.displayDetails();

	}
}
