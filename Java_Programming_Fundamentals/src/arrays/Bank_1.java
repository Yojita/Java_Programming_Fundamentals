package arrays;

public class Bank_1 {
	public static void main(String[] args) {
		Customer[] customer = new Customer[2];
		Customer customer1 = new Customer("Anil", "Acc12345");
		Customer customer2 = new Customer("Ajay", "Acc67890");
		customer[0] = customer1;
		customer[1] = customer2;
		for (int i = 0; i < customer.length; i++) {
			Customer customerObject = customer[i];
			String name = customerObject.displayCustomerName();
			System.out.println("The customer name is : " + name);
		}
	}
}
