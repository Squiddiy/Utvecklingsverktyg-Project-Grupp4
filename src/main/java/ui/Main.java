package ui;

import david.*;
import Hamodi.*;
import jensen.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Book book1 = new Book(1, "The Fellowship of the Ring", "J.R.R Tolkien", "High Fantasy", "01234", 111);
		Book book2 = new Book(2, "Dune", "Frank Herbert", "Science Fiction", "43210", 222);
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);

		Movie movie1 = new Movie(2, "The Dark Knight", "Christopher Nolan", 9.0);
		Movie movie2 = new Movie(3, "The Lord of the Rings", "Peter Jackson", 8.8);
		MovieCollection movieCollection = new MovieCollection();
		movieCollection.addMovie(movie1);
		movieCollection.addMovie(movie2);

		GameCollection gameCollection = new GameCollection();
		Game game1 = new Game("Super Mario", "Miyamoto", "Nintendo", Game.gameRating.C, 10);
		Game game2 = new Game("Legend Of Zelda", "Sakurai", "Nintendo", Game.gameRating.E, 9);
		gameCollection.addGame(game1);
		gameCollection.addGame(game2);

		Scanner scan = new Scanner(System.in);
		Start(scan, books, movieCollection, gameCollection);

	}

	public static void Start(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		System.out.println("What collection do you want to work with?");
		System.out.println("1. Books");
		System.out.println("2. Movies");
		System.out.println("3. Games");
		System.out.println("4. Exit");
		boolean again = true;
		while (again) {

			again = false;
			String userInput = scan.nextLine();

			switch (userInput.toLowerCase()) {
			case "books":
			case "1":
				BookMain.Books(scan, bookList, mc, gc);
				break;

			case "movies":
			case "2":
				MovieMain.Movies(scan, bookList, mc, gc);
				break;

			case "games":
			case "3":
				GameMain.Games(scan, bookList, mc, gc);
				break;

			case "exit":
			case "4":
				System.exit(0);
				break;

			default:
				System.out.println("Please pick one of the options");
				again = true;
				break;
			}
		}
	}

}
