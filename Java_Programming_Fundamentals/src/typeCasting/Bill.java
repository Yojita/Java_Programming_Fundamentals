package typeCasting;

public class Bill {
	private int billId;
	private int customerId;
	private int discount;
	private double billAmount;

	public void discountedBillAmount() {
		System.out.print("Discounted Bill Amount : ");
		System.out.println(billAmount - (billAmount * (discount / 100)));
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public static void main(String[] args) {
		Bill bill = new Bill();
		bill.setBillId(1001);
		bill.setCustomerId(101);
		bill.setDiscount(2);
		bill.setBillAmount(199.99);

		System.out.println("Bill Id             :" + bill.getBillId());
		System.out.println("Customer Id         : " + bill.getCustomerId());
		System.out.println("Discount percentage : " + bill.getDiscount());
		bill.discountedBillAmount();
	}
}
