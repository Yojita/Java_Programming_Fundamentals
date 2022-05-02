package arrays;

public class Bank {
	public static void main(String[] args) {
		int[] phone = new int[3];
		phone[0] = 123456789;
		phone[1] = 987654321;
		phone[2] = 123289374;
		int count = 1;
		for (int i = 0; i < phone.length; i++) {
			System.out.println("Phone Number " + count + ": " + phone[i]);
			count++;
		}
	}
}
