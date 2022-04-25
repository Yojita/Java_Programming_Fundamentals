package polymorphism;

public class PlayerRatings {
	private int playerPosition;
	private String playerName;
	private float criticOneRating;
	private float criticTwoRating;
	private float criticThreeRating;
	private float averageRatings;
	private char category;

	public int getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		this.playerPosition = playerPosition;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public float getCriticOneRating() {
		return criticOneRating;
	}

	public void setCriticOneRating(float criticOneRating) {
		this.criticOneRating = criticOneRating;
	}

	public float getCriticTwoRating() {
		return criticTwoRating;
	}

	public void setCriticTwoRating(float criticTwoRating) {
		this.criticTwoRating = criticTwoRating;
	}

	public float getCriticThreeRating() {
		return criticThreeRating;
	}

	public void setCriticThreeRating(float criticThreeRating) {
		this.criticThreeRating = criticThreeRating;
	}

	public float getAverageRatings() {
		return averageRatings;
	}

	public void setAverage(float average) {
		this.averageRatings = average;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public PlayerRatings(int playerPosition, String playerName) {
		this.playerPosition = playerPosition;
		this.playerName = playerName;
	}

	public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
		this.criticOneRating = criticOneRating;
		this.criticTwoRating = criticTwoRating;
		this.averageRatings = (criticOneRating + criticTwoRating) / 2;
	}

	public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
		this.criticOneRating = criticOneRating;
		this.criticTwoRating = criticTwoRating;
		this.criticThreeRating = criticThreeRating;
		this.averageRatings = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
	}

	public void calculateCategory() {
		if (averageRatings > 8) {
			category = 'A';
		} else if (averageRatings > 5 && averageRatings <= 8) {
			category = 'B';
		} else if (averageRatings > 0 && averageRatings <= 5) {
			category = 'C';
		} else {
			System.out.println("Invalid Ratings");
		}
	}

	public void display() {
		System.out.println("The player name is : " + getPlayerName());
		System.out.println("The player position is : " + getPlayerPosition());
		System.out.println("The average rating is : " + getAverageRatings());
		System.out.println("The category is : " + getCategory());
	}
}
