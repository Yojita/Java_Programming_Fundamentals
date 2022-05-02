package superKeyword;

public class EventRegistration {
	protected String name;
	protected String nameOfEvent;
	protected double registrationFee;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfEvent() {
		return nameOfEvent;
	}

	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public EventRegistration(String name, String nameOfEvent) {
		this.name = name;
		this.nameOfEvent = nameOfEvent;
	}

	public void registerEvent() {
		if (this.nameOfEvent == "ShakeALeg") {
			this.registrationFee = 100.0;
		}
		if (this.nameOfEvent == "Sing&Win") {
			this.registrationFee = 150.0;
		}
		if (this.nameOfEvent == "Actathon") {
			this.registrationFee = 70.0;
		}
		if (this.nameOfEvent == "PlayAway") {
			this.registrationFee = 130.0;
		}
	}
}
