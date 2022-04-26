package staticVariables;

public class Account {
	static int minBal; // class variable

	static {
		minBal = 500; // static block
	}

	public static int getMinBal() {
		return minBal;
	}

	public static void main(String[] args) {
		System.out.println("The value : " + getMinBal());
	}
}
