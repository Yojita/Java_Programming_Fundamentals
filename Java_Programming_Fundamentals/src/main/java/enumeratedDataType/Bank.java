package enumeratedDataType;

enum Designation {
	CEO, GeneralManager, RegionalManager, BranchManager
}

public class Bank {
	public void roleDefined(Designation designation) {
		switch (designation) {
		case CEO:
			System.out.println("Role of CEO");
			break;
		case GeneralManager:
			System.out.println("Role of General Manager");
			break;
		case RegionalManager:
			System.out.println("Role of Regional Manager");
			break;
		case BranchManager:
			System.out.println("Role of Branch Manager");
			break;
		}
	}
}
