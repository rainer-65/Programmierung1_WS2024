package ch.fhnw.richards.week03_YourOwnClasses_Part1.solutions;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ISBN: ");
        String ISBN = in.nextLine();
        System.out.println("Enter the author: ");
        String author = in.nextLine();
        System.out.println("Enter the title: ");
        String title = in.nextLine();
        System.out.println("Enter the price: ");
        float price = in.nextFloat();
        System.out.println("Enter the number of pages: ");
        int numPages = in.nextInt();
        System.out.println("Enter the inventory size: ");
        int inventorySize = in.nextInt();
        in.close();

        // Create a book object and set the attributes
        Book book = new Book(ISBN, inventorySize);
        book.setAuthor(author);
        book.setTitle(title);
        book.setPrice(price);
        book.setInventorySize(inventorySize);
        book.setNumberOfPages(numPages);

        // Book information
        System.out.println("Book information follows:");
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Number of pages: " + book.getNumberOfPages());
        System.out.println("Inventory size: " + book.getInventorySize());
        System.out.println();

        // Selling books
        book.sellBook(4);
        System.out.println("Book information follows:");
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Number of pages: " + book.getNumberOfPages());
        System.out.println("Inventory size: " + book.getInventorySize());
        System.out.println();

        // Buying books
        book.buyBook(3);
        System.out.println("Book information follows:");
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Number of pages: " + book.getNumberOfPages());
        System.out.println("Inventory size: " + book.getInventorySize());
    }
}
