package arrays;

public class EmployeeRecord {
	public static void main(String[] args) {
		double salary[] = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
		double avgSalary = 0.0;
		int noOfEmployees = 0;
		double sumOfSalaries = 0.0;
		for (int i = 0; i < salary.length; i++) {
			sumOfSalaries += salary[i];
			noOfEmployees++;
		}
		avgSalary = sumOfSalaries / noOfEmployees;
		System.out.println("The average salary of the employee is : " + avgSalary);

		int greaterThanAvg = 0;
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] > avgSalary) {
				greaterThanAvg++;
			}
		}
		System.out.println("The number of employees having salary greater than the average is : " + greaterThanAvg);

		int lessThanAvg = 0;
		for (int i = 0; i < salary.length; i++) {
			if (salary[i] < avgSalary) {
				lessThanAvg++;
			}
		}
		System.out.println("The number of employees having salary lesser than the average is : " + lessThanAvg);
	}
}
