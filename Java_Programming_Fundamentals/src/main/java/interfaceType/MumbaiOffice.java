package interfaceType;

public class MumbaiOffice implements IBank {

	@Override
	public String createAccount(Customer customer) {
		return "Acc12345";
	}

	@Override
	public double issueVehicleLoan(String vehicleType, Customer customer) {
		if (vehicleType.equals("bike")) {
			return 100000;
		} else {
			return 500000;
		}
	}

	@Override
	public double issueHouseLoan(Customer customer) {
		return 2000000;
	}

	@Override
	public double issueGoldLoan(Customer customer) {
		return 500000;
	}

}
