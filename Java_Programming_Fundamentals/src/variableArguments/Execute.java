package variableArguments;

public class Execute {
	public static void main(String[] args) {
		Employee emp1 = new Employee("E1001");
		int rewardPoint1 = emp1.reward(100000, 200000, 300000);

		Employee emp2 = new Employee("E1002");
		int rewardPoint2 = emp2.reward(100000, 100000);

		System.out.println(emp1.getEmployeeId() + " has got reward of : " + rewardPoint1);
		System.out.println(emp2.getEmployeeId() + " has got reward of : " + rewardPoint2);
	}
}
