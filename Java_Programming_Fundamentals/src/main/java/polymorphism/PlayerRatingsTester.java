package polymorphism;

public class PlayerRatingsTester {
	public static void main(String[] args) {
		PlayerRatings playerRatings_1 = new PlayerRatings(1, "Beckham");
		playerRatings_1.calculateAverageRating(9, 9.9f);
		playerRatings_1.calculateCategory();
		playerRatings_1.display();
		System.out.println();

		PlayerRatings playersRatings_2 = new PlayerRatings(1, "Oscar");
		playersRatings_2.calculateAverageRating(1, 1, 1);
		playersRatings_2.calculateCategory();
		playersRatings_2.display();
	}
}
