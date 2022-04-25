package polymorphism;

public class Registration_Tester {
	public static void main(String[] args) {
		Registration registration_1 = new Registration("Kelvin", "MN9891N", new long[] { 987456321L, 123456789L });
		registration_1.display();
		System.out.println();

		Registration registration_2 = new Registration("Julias", 123, "PN7878", new long[] { 123456789, 987654321 });
		registration_2.display();
		System.out.println();

		Registration registration_3 = new Registration("Jammy", 45453, 765, new long[] { 123456789, 987654321 });
		registration_3.display();
		System.out.println();

		Registration registration_4 = new Registration("Rose", "PN8965", 15324, new long[] { 123456789L, 987654123L });
		registration_4.display();
		System.out.println();
	}
}
