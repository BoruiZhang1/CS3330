package g18;

import g18.Class.Book; 
import g18.Class.Library;

public class LibraryApp {

	public static void main(String[] args) {
		// Creates a new Library object
		Library library = new Library();

		// Creates three new Book objects
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
		Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99);

		// Adds the three books to the book array in library
		System.out.println("Adding books...");
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		System.out.println("Book added successfully.");

		// Creates a ISBN to search for and then searches the book array for a matching ISBN
		String searchISBN = "978-0135166307";
		System.out.println("\nSearching for book with ISBN: " + searchISBN);
		Book foundBook = library.searchByISBN(searchISBN);
		if(foundBook != null) {
			System.out.println("Book found: " + foundBook.toString());
		}
		else {
			System.out.println("Book not found");
		}

		// Lists the books in the book array
		System.out.println();
		library.displayBooks();

		// Removes book2 from the book array
		System.out.println("\nRemoving book: " + book2.toString());
		library.removeBook(book2);

		// Lists the books in the book array
		System.out.println();
		library.displayBooks();

		// Tries to remove a book from the book array that does not exist
		System.out.println();
		if(!library.removeBook(book2)) {
			System.out.println("Cannot remove book \"" + book2.toString() + "\", book does not exist");
		}
		
	}

}
