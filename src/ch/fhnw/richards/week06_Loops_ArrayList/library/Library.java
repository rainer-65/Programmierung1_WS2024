package ch.fhnw.richards.week06_Loops_ArrayList.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		int command = 0;
		while (command != 4) {
			System.out.println("Enter 1 to add, 2 to delete, "
		                       + "3 to print, 4 to quit");
			command = in.nextInt();
			in.nextLine(); // Get rid of "enter" key

			if (command == 1) addBook(in, library);
			else if (command == 2) deleteBook(in, library);
			else if (command == 3) printLibrary(library);
		}
		in.close();
	}

	private static void addBook(Scanner in, ArrayList<Book> library) {
		System.out.println("Enter ISBN");
		String ISBN = in.nextLine();
		System.out.println("Enter author");
		String author = in.nextLine();
		System.out.println("Enter title");
		String title = in.nextLine();
		System.out.println("Enter number of pages");
		int numPages = in.nextInt();
		in.nextLine(); // Get rid of enter key

		Book book = new Book(ISBN);
		book.setAuthor(author);
		book.setTitle(title);
		book.setNumberOfPages(numPages);
		
		library.add(book);
	}

	private static void deleteBook(Scanner in, ArrayList<Book> library) {
	}

	private static void printLibrary(ArrayList<Book> library) {
	}
}
