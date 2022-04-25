package inheritance;

public class EmployeeSalaryCalculator {
	public static void main(String[] args) {
		PermanentEmployee pEmp = new PermanentEmployee();
		pEmp.setName("Anil");
		pEmp.setEmpId(101);
		pEmp.setBasicPay(10000);
		pEmp.setHra(1500);
		pEmp.setExperience(3);
		pEmp.calculateSalary();

		System.out.println("Permanent Employee your salary is : " + pEmp.getSalary());
		
		ContractEmployee cEmp = new ContractEmployee();
		cEmp.setName("Ankit");
		cEmp.setEmpId(102);
		cEmp.setWages(500);
		cEmp.setHours(10);
		cEmp.calculateSalary();
		
		System.out.println("Contract Employee your salary is : " + cEmp.getSalary());

		}
}
