package polymorphism;

public class Registration {
	private String customerName;
	private String panCardNo;
	private int voterId;
	private String passPortNo;
	private int licencseNo;
	private long[] telephoneNo;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPanCardNo() {
		return panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getPassPortNo() {
		return passPortNo;
	}

	public void setPassPortNo(String passPortNo) {
		this.passPortNo = passPortNo;
	}

	public int getLicencseNo() {
		return licencseNo;
	}

	public void setLicencseNo(int licencseNo) {
		this.licencseNo = licencseNo;
	}

	public long[] getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(long[] telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	Registration(String customerName, String passPortNo, long[] telephoneNo) {
		this.customerName = customerName;
		this.passPortNo = passPortNo;
		this.telephoneNo = telephoneNo;
	}

	Registration(String customerName, int licencseNo, String panCardNo, long[] telephoneNo) {
		this.customerName = customerName;
		this.licencseNo = licencseNo;
		this.panCardNo = panCardNo;
		this.telephoneNo = telephoneNo;
	}

	Registration(String customerName, int voterId, int licencseNo, long[] telephoneNo) {
		this.customerName = customerName;
		this.voterId = voterId;
		this.licencseNo = licencseNo;
		this.telephoneNo = telephoneNo;
	}

	Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo) {
		this.customerName = customerName;
		this.panCardNo = panCardNo;
		this.voterId = voterId;
		this.telephoneNo = telephoneNo;
	}

	public void display() {
		System.out.println("Congratulations " + customerName
				+ "!!! You have been successfully registered for our services with the following details : ");
		if (passPortNo != null) {
			System.out.println("Passport Number : " + passPortNo);
		}
		if (licencseNo != 0) {
			System.out.println("License Number : " + licencseNo);
		}
		if (panCardNo != null) {
			System.out.println("Pan card Number : " + panCardNo);
		}
		if (voterId != 0) {
			System.out.println("Voter Id : " + voterId);
		}
		System.out.println("Phone Numbers: ");
		System.out.println("" + telephoneNo[0]);
		System.out.println("" + telephoneNo[1]);
	}

}
