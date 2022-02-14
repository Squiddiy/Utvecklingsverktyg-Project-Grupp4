package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Hamodi.Movie;
import Hamodi.MovieCollection;
import david.Book;
import jensen.GameCollection;

public class MovieMain {

	public static void Movies(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		System.out.println("What do u want to do?");
		System.out.println("1. Add Movie");
		System.out.println("2. Check current Movies");
		System.out.println("3. Return");

		String userInput = scan.nextLine();

		boolean again = true;
		while (again) {
			again = false;
			switch (userInput.toLowerCase()) {
			case "add movie":
			case "1":
				AddMovie(scan, bookList, mc, gc);
				break;

			case "check current movies":
			case "2":
				CheckMovies(scan, bookList, mc, gc);
				break;
				
			case "return":
			case "3":
				Main.Start(scan, bookList, mc, gc);
				break;

			default:
				System.out.println("Please pick one of the options");
				again = true;
				break;
			}
		}
	}

	public static void AddMovie(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		System.out.println("What is the movie id?");
		int movieId = scan.nextInt();
		scan.nextLine();

		System.out.println("What is the name of the movie?");
		String name = scan.nextLine();

		System.out.println("Who is the director of the movie?");
		String director = scan.nextLine();

		System.out.println("What is the rating of the movie?");
		double rating = scan.nextDouble();

		Movie newBook = new Movie(movieId, name, director, rating);
		mc.addMovie(newBook);
		;
		scan.nextLine();
		Movies(scan, bookList, mc, gc);
	}

	public static void CheckMovies(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		for (int i = 0; i < mc.getNumberOfMovie(); i++) {
			Movie movie = mc.getMovie().get(i);
			System.out.println((i + 1) + ". Name : " + movie.getName() + ", Director : " + movie.getDirector()
					+ ", Rating : " + movie.getRating());
		}
		scan.nextLine();
		Movies(scan, bookList, mc, gc);
	}

}
