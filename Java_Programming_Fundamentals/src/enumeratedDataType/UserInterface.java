package enumeratedDataType;

public class UserInterface {
	public static void main(String[] args) {
		for (DAY day : DAY.values())
			System.out.println("Day : " + day.name() + " Value : " + day.getValue());
	}
}
