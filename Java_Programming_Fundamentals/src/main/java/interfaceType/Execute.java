package interfaceType;

public class Execute {
	public static void main(String[] args) {
		IBank ibank = new MumbaiOffice();
		Customer customer = new Customer();
		customer.setCustomerId("Cust1001");
		customer.setName("Aakash");
		System.out.println("Account Number : " + ibank.createAccount(customer));
		System.out.println("Gold loan Amount is : " + ibank.issueGoldLoan(customer));
		System.out.println();
		}
}
