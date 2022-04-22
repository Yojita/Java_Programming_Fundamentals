package constructors;

public class Chocolate {
	private int barCode;
	private String name;
	private int weight;
	private int cost;

	Chocolate(int cBarCode, String cName, int cWeight, int cCost) {
		barCode = cBarCode;
		name = cName;
		weight = cWeight;
		cost = cCost;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static void main(String[] args) {
		Chocolate chocolate = new Chocolate(101, "Cadbury", 12, 10);
		System.out.println("Bar Code : " + chocolate.getBarCode());
		System.out.println("Name : " + chocolate.getName());
		System.out.println("Weight : " + chocolate.getWeight());
		System.out.println("Cost : " + chocolate.getCost());

		chocolate.setBarCode(102);
		chocolate.setName("Hershey's");
		chocolate.setWeight(24);
		chocolate.setCost(50);

		System.out.println("*****************");
		System.out.println("Bar Code : " + chocolate.getBarCode());
		System.out.println("Name : " + chocolate.getName());
		System.out.println("Weight : " + chocolate.getWeight());
		System.out.println("Cost : " + chocolate.getCost());

	}

}
