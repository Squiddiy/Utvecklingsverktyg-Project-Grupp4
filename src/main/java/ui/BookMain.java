package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Hamodi.MovieCollection;
import david.Book;
import jensen.GameCollection;


public class BookMain {
	
	public static void Books(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc) {
		System.out.println("What do u want to do?");
		System.out.println("1. Add Book");
		System.out.println("2. Remove Book");
		System.out.println("3. Check current Books");
		System.out.println("4. Return");

		String userInput = scan.nextLine();

		boolean again = true;
		while (again) {
			again = false;
			switch (userInput.toLowerCase()) 
			{
			case "add book":
			case "1":
				AddBook(scan, bookList, mc, gc);
				break;

			case "remove book":
			case "2":
				RemoveBook(scan, bookList, mc, gc);
				break;

			case "check current books":
			case "3":
				CheckBooks(scan, bookList, mc, gc);
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
	public static void AddBook(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc)
	{
		System.out.println("What is the book id?");
		int bookId = scan.nextInt();
		
		System.out.println("How many pages does the book have");
		int numberOfPages = scan.nextInt();
		scan.nextLine();
		
		System.out.println("What is the title of the book?");
		String title = scan.nextLine();
		
		System.out.println("Who is the author of the book?");
		String author = scan.nextLine();
		
		System.out.println("What is the genre of the book?");
		String genre = scan.nextLine();
		
		System.out.println("What is the isbn of the book?");
		String isbn = scan.nextLine();
		
		Book newBook = new Book(bookId, title, author, genre, isbn, numberOfPages);
		bookList.add(newBook);
		scan.nextLine();
		Books(scan, bookList, mc, gc);
	}
	public static void RemoveBook(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc)
	{
		try
		{
			
		System.out.println("What book do you want to remove?");
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println((i+1) + ". " + bookList.get(i).getTitle());
		}
		System.out.println();
		int userInput = scan.nextInt();
		bookList.remove(userInput - 1);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Book Not Found");
		}
		scan.nextLine();
		Books(scan, bookList, mc, gc);
	}
	public static void CheckBooks(Scanner scan, ArrayList<Book> bookList, MovieCollection mc, GameCollection gc)
	{
		System.out.println("Current Books :");
		for (int i = 0; i < bookList.size(); i++) 
		{
			System.out.println((i+1) + ". " + bookList.get(i).getTitle());
		}
		scan.nextLine();
		Books(scan, bookList, mc, gc);
	}
}
