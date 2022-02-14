package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Hamodi.MovieCollection;
import david.Book;
import jensen.*;
import jensen.Game.gameRating;

public class GameMain {

	public static void Games(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		System.out.println("What do u want to do?");
		System.out.println("1. Add Game");
		System.out.println("2. Remove Game");
		System.out.println("3. Check current Games");
		System.out.println("4. Return");

		String userInput = scan.nextLine();

		boolean again = true;
		while (again) {
			again = false;
			switch (userInput.toLowerCase()) {
			case "add book":
			case "1":
				AddGame(scan, bookList, mc, gc);
				break;

			case "remove book":
			case "2":
				RemoveGame(scan, bookList, mc, gc);
				break;

			case "check current books":
			case "3":
				CheckGame(scan, bookList, mc, gc);
				break;

			case "return":
			case "4":
				Main.Start(scan, bookList, mc, gc);
				break;

			default:
				System.out.println("Please pick one of the options");
				again = true;
				break;
			}
		}
	}

	public static void AddGame(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {

		System.out.println("What is the title of the game?");
		String title = scan.nextLine();

		System.out.println("Who is the director of the game?");
		String director = scan.nextLine();

		System.out.println("What company made the game?");
		String gameCompany = scan.nextLine();

		System.out.println("What is the Age-Rating");
		Game.gameRating rating = gameRating.valueOf(scan.nextLine().toUpperCase());

		System.out.println("What is the review score of the game?");
		int score = scan.nextInt();

		Game game = new Game(title, director, gameCompany, rating, score);
		gc.addGame(game);
		scan.nextLine();
		Games(scan, bookList, mc, gc);
	}

	public static void RemoveGame(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		System.out.println("What game should get removed? :");
		try {
			for (int i = 0; i < gc.howManyGames(); i++) {
				Game game = gc.getGames().get(i);
				System.out.println((i + 1) + ". Game Name : " + game.getNameOfGame() + ", Game Director : "
						+ game.getGameDirector() + ", Game Company, : " + game.getGameCompany() + ", Age Rating : "
						+ game.GetRating() + ", Review Score : " + game.getReviewScore());
			}
			Game gameToRemove = gc.getGames().get(scan.nextInt() - 1);
			gc.removeGame(gameToRemove.getNameOfGame());
		} catch (GameNotFoundException e) {
			System.out.println("Game not Found");
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Game not Found");
		}
		scan.nextLine();
		Games(scan, bookList, mc, gc);
	}

	public static void CheckGame(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		System.out.println("Ur Games :");
		for (int i = 0; i < gc.howManyGames(); i++) {
			Game game = gc.getGames().get(i);
			System.out.println((i + 1) + ". Game Name : " + game.getNameOfGame() + ", Game Director : "
					+ game.getGameDirector() + ", Game Company, : " + game.getGameCompany() + ", Age Rating : "
					+ game.GetRating() + ", Review Score : " + game.getReviewScore());
		}
		scan.nextLine();
		Games(scan, bookList, mc, gc);
	}
}