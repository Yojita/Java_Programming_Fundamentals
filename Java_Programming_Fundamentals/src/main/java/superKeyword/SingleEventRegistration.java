package superKeyword;

public class SingleEventRegistration extends EventRegistration {
	private int participantNo;

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}

	SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name, nameOfEvent);
		this.participantNo = participantNo;
	}

	public void registerEvent() {
		if (super.nameOfEvent == "ShakeALeg") {
			super.registrationFee = 100.0;
		}
		if (super.nameOfEvent == "Sing&Win") {
			super.registrationFee = 150.0;
		}
		if (super.nameOfEvent == "PlayAway") {
			super.registrationFee = 130.0;
		}
		System.out.println("Thank you " + super.getName() + " for your participation. Your registration fee is : " + super.registrationFee);
		System.out.println("You are participant no: " + this.getParticipantNo());
	}
}
