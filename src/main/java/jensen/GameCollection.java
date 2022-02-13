package jensen;

import java.util.ArrayList;

public class GameCollection {

	private ArrayList<Game> games = new ArrayList<Game>();

	public ArrayList<Game> getGames() {
		return games;
	}

	//Getting how many Games that the Collection Contains
	public int howManyGames() {
		return games.size();
	}

	public void addGame(Game game) {
		games.add(game);
	}
	
	public void removeGame(String gameName) throws GameNotFoundException
	{
		for (Game game : games) {
			if(game.getNameOfGame() == gameName)
			{
				games.remove(game);
				return;
			}
		}
		throw new GameNotFoundException();
	}

	public Game findGame(String gameName) throws GameNotFoundException {

		gameName = gameName.trim();
		
		for (Game game : games) {
			if (game.getNameOfGame().equalsIgnoreCase(gameName)) {
				return game;
			}
		}
		throw new GameNotFoundException();

	}

}
