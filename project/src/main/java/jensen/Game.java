package jensen;

import java.util.Objects;

public class Game {

	//Every Game gets a rating based on which Audience its directed towards
	//C = Children, E = Everyone, T = Teen, M = Mature, A = Adult
	public enum gameRating {
		C, E, T, M, A
	};

	private gameRating rating;
	private String nameOfGame;
	private String gameDirector;
	private String gameCompany;
	private int reviewScore;

	public Game(String nameOfGame, String gameDirector, String gameCompany, gameRating rating, int reviewScore) {
		this.rating = rating;
		this.nameOfGame = nameOfGame;
		this.gameDirector = gameDirector;
		this.gameCompany = gameCompany;
		this.reviewScore = reviewScore;
	}

	public gameRating getRating() {
		return rating;
	}

	public void setRating(gameRating rating) {
		this.rating = rating;
	}

	public String getNameOfGame() {
		return nameOfGame;
	}

	public String getGameDirector() {
		return gameDirector;
	}

	public String getGameCompany() {
		return gameCompany;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gameCompany, gameDirector, nameOfGame, rating, reviewScore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(gameCompany, other.gameCompany) && Objects.equals(gameDirector, other.gameDirector)
				&& Objects.equals(nameOfGame, other.nameOfGame) && rating == other.rating
				&& reviewScore == other.reviewScore;
	}
	

}
