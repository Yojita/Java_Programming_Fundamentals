package abstractClass;

abstract class Branch {
	public abstract boolean validatePhotoProof(String proof);

	public abstract boolean validateAddressProof(String proof);

	public void openAccount(String photoProof, String addressProof, int amount) {
		if (amount >= 1000) {
			if (validateAddressProof(addressProof) && validatePhotoProof(photoProof)) {
				System.out.println("Account opened");
			} else {
				System.out.println("Cannot open account");
			}
		} else {
			System.out.println("Cannot open account");
		}
	}
}
