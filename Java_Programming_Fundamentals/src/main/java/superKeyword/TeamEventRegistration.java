package superKeyword;

public class TeamEventRegistration extends EventRegistration {
	
	private int noOfParticipants;
	private int teamNo;

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
		super(name, nameOfEvent);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	public void registerEvent() {
		if(super.nameOfEvent == "ShakeALeg") {
			super.registrationFee = 50.0 * this.noOfParticipants;
		}
		if(super.nameOfEvent == "Sing&Win") {
			super.registrationFee = 60.0 * this.noOfParticipants;
		}
		if(super.nameOfEvent == "Actathon") {
			super.registrationFee = 80.0 * this.noOfParticipants;
		}
		if(super.nameOfEvent == "PlayAway") {
			super.registrationFee = 100.0 * this.noOfParticipants;
		}
		System.out.println("Thank you " + super.getName() + " for your participation. Your registration fee is : " + super.registrationFee);
		System.out.println("You are team no: " + this.getTeamNo());
	}
	

}
