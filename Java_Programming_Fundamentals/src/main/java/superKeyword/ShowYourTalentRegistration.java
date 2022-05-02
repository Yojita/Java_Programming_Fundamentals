package superKeyword;

public class ShowYourTalentRegistration {
	public static void main(String[] args) {
		EventRegistration participant_1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
		participant_1.registerEvent();

		EventRegistration team_1 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
		team_1.registerEvent();

		EventRegistration participant_2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
		participant_2.registerEvent();
	}
}
