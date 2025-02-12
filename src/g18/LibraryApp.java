package assignment1;

import assignment1.librarysystem.Book;
import assignment1.librarysystem.Library;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
		Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99);
		
		System.out.println("Adding books...");
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		System.out.println("Book added successfully.");
		
		String searchISBN = "978-0135166307";
		System.out.println("\nSearching for book with ISBN: " + searchISBN);
		Book foundBook = library.searchByISBN(searchISBN);
		if(foundBook != null) {
			System.out.println("Book found: " + foundBook.toString());
		}
		else {
			System.out.println("Book not found");
		}
		
		System.out.println();
		library.displayBooks();
		
		System.out.println("\nRemoving book: " + book2.toString());
		library.removeBook(book2);
		
		System.out.println();
		library.displayBooks();
		
		System.out.println();
		if(!library.removeBook(book2)) {
			System.out.println("Cannot remove book \"" + book2.toString() + "\", book does not exist");
		}
		
	}

}
