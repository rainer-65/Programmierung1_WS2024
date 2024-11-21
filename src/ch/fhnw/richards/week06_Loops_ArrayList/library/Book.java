package ch.fhnw.richards.week06_Loops_ArrayList.library;

public class Book {
	private final String ISBN;
	private String author;
	private String title;
	private int numberOfPages;

	public Book(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author.length() >= 3) this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() >= 3) this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		if (numberOfPages >= 10) this.numberOfPages = numberOfPages;
	}

	public String getISBN() {
		return ISBN;
	}	
}
