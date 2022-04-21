package conditionalStatements;

public class ReverseCalculator_forLoop {
	public static void main(String[] args) {
		int num = 72, rem = 0, reverseNum = 0;
		for (; num != 0; num /= 10) {
			rem = num % 10;
			reverseNum = reverseNum * 10 + rem;
		}
		System.out.println("Reverse number is : " + reverseNum);
	}
}
