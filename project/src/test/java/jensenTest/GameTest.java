package jensenTest;

import org.junit.Test;

import jensen.Game;

import static org.junit.Assert.*;

public class GameTest {
	
	@Test
	public void TestTwoGamesMatch()
	{
		Game game1 = new Game("Legend Of Zelda", "Sakurai", "Nintendo", Game.gameRating.E, 9);	
		Game game2 = new Game("Legend Of Zelda", "Sakurai", "Nintendo", Game.gameRating.E, 9);	
		
		assertEquals(game1, game2);
	}
	@Test
	public void TestTwoGamesDoNotMatch()
	{
		Game game1 = new Game("Super Mario", "Miyamoto", "Nintendo", Game.gameRating.C, 10);	
		Game game2 = new Game("Legend Of Zelda", "Sakurai", "Nintendo", Game.gameRating.E, 9);	
		
		assertNotEquals(game1, game2);
	}
	
	@Test
	public void TestGameMadeBySameCompany()
	{
		Game game1 = new Game("Super Mario", "Miyamoto", "Nintendo", Game.gameRating.C, 10);	
		Game game2 = new Game("Legend Of Zelda", "Sakurai", "Nintendo", Game.gameRating.E, 9);	
		
		assertEquals(game1.getGameCompany(), game2.getGameCompany());
		
	}



}
