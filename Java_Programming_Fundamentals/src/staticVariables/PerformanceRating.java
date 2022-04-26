package staticVariables;

import java.awt.Point;

public class PerformanceRating {
	private static final int Outstanding = 5;
	private static final int Good = 4;
	private static final int Average = 3;
	private static final int Poor = 2;

	static int calculatePerformance(Employee employee) {
		int points = employee.getPoint();

		if (points >= 80 && points <= 100) {
			return Outstanding;
		} else if (points >= 60 && points <= 79) {
			return Good;
		} else if (points >= 50 && points <= 59) {
			return Average;
		} else if (points >= 1 && points <= 49) {
			return Poor;
		} else {
			System.out.println("Invalid points");
		}
		return 0;
	}
}
