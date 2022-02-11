package jensenTest;

import org.junit.Test;

import jensen.*;

import static org.junit.Assert.*;

public class GameCollectionTest {

	private GameCollection gc;
	private Game game;

	public GameCollectionTest() {
		gc = new GameCollection();
		game = new Game("Legend Of Zelda", "Sakurai", "Nintendo", Game.gameRating.E, 9);
		gc.addGame(game);
	}

	@Test
	public void testHowManyGames() {
		assertTrue(gc.howManyGames() == 1);
	}

	@Test
	public void testAddGame() {
		int length = gc.howManyGames();
		Game game1 = new Game("Bumblebee", "Sega", "Haruka", Game.gameRating.C, 5);
		gc.addGame(game1);
		assertTrue(length + 1 == gc.howManyGames());
	}

	@Test
	public void testRemoveGame() {
		try {
			int length = gc.howManyGames();
			gc.removeGame("Legend Of Zelda");
			assertTrue(length - 1 == gc.howManyGames());
		} catch (GameNotFoundException e) {
			fail();
		}
	}

	@Test
	public void testFindGame() {
		try {
			Game game2 = gc.findGame("Legend Of Zelda");
			assertEquals(game, game2);
		} catch (GameNotFoundException e) {
			fail();
		}
	}

	@Test
	public void testFindGameIgnoringCase() {
		try {
			Game game2 = gc.findGame("lEGenD OF zElDA");
			assertEquals(game, game2);
		} catch (GameNotFoundException e) {
			fail();
		}
	}

	@Test
	public void testFindGameIgnoringSpaces() {
		try {
			Game game2 = gc.findGame("    Legend Of Zelda      ");
			assertEquals(game, game2);
		} catch (GameNotFoundException e) {
			fail();
		}
	}

	@Test
	public void testToFindGameThatDosentExist() {
		assertThrows(GameNotFoundException.class, () -> gc.findGame("Mortal Kombat 7"));
	}

}
