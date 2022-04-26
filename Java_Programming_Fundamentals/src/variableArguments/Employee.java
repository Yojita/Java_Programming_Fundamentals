package variableArguments;

public class Employee {
	private String employeeId;

	Employee(String employeeId) {
		this.employeeId = employeeId;
	}

	public int reward(double... fixedDeposit) {
		double sum = 0;
		int rewardPoint = 0;
		for (double deposit : fixedDeposit) {
			sum = sum + deposit;
		}
		if (sum > 1000000) {
			rewardPoint = 20000;
		} else if (sum < 1000000 && sum >= 5000000) {
			rewardPoint = 10000;
		} else {
			rewardPoint = 0;
		}
		return rewardPoint;
	}

	public String getEmployeeId() {
		return employeeId;
	}
}
