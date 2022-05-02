package conditionalStatements;

public class ReverseCalculator_whileLoop {
	public static void main(String[] args) {
		int num = 72, reverseNum = 0;
		while (num > 0) {
			int rem = num % 10;
			reverseNum = reverseNum * 10 + rem;
			num /= 10;
		}
		System.out.println("Reverse number is : " + reverseNum);
	}
}
