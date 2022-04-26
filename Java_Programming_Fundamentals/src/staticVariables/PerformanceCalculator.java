package staticVariables;

public class PerformanceCalculator {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setPoint(69);
		System.out.println("Employee 1 : " + PerformanceRating.calculatePerformance(emp1));

		Employee emp2 = new Employee();
		emp2.setPoint(85);
		System.out.println("Employee 2 : " + PerformanceRating.calculatePerformance(emp2));

		Employee emp3 = new Employee();
		emp3.setPoint(59);
		System.out.println("Employee 3 : " + PerformanceRating.calculatePerformance(emp3));
	}

}
