package typeCasting;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		double d = 234.04;
		long l = (long) d; // explicit type casting
		int i = (int) l; // explicit type casting
		System.out.println("Double value : " + d);
		System.out.println("Long value : " + l);
		System.out.println("int value " + i);
	}
}
