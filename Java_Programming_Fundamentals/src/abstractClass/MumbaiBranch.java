package abstractClass;

public class MumbaiBranch extends Branch {

	@Override
	public boolean validatePhotoProof(String proof) {
		if (proof.equalsIgnoreCase("pan card")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateAddressProof(String proof) {
		if (proof.equalsIgnoreCase("ration card")) {
			return true;
		}
		return false;
	}

}
