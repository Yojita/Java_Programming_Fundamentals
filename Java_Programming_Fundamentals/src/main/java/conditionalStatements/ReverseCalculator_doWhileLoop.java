package conditionalStatements;

public class ReverseCalculator_doWhileLoop {
	public static void main(String[] args) {
		int num = 72, reverseNum = 0, rem = 0;
		do {
			rem = num % 10;
			reverseNum = reverseNum * 10 + rem;
			num /= 10;
		} while (num > 0);
		System.out.println("Reverse number is : " + reverseNum);
	}
}
