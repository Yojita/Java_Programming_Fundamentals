package inheritance;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private int experience;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void calculateSalary() {
		double basicPayPercentage = 1;
		if (experience >= 3 && experience < 5) {
			basicPayPercentage = 0.05;
		} else if (experience >= 5 && experience < 10) {
			basicPayPercentage = 0.07;
		} else {
			basicPayPercentage = 0.12;
		}
		setSalary((basicPayPercentage * basicPay) + basicPay + hra);
	}
}
