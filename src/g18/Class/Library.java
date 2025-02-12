package g18.Class;
/**
 * 
 * library will manage the book collection
 * 
 */
public class Library 
{
	
	private Book[] books;
	private int count;
	
	//default constructor
	public Library() 
	{
			
		books = new Book[5];
		count = 0;
	}
	

	/** This is a method to add a book to collection ,if max amount of books reached return false, else we add the book and increase book counts
	 * 
	 * @param book
	 * 		  book is the object we are adding
	 * @return
	 * 		  True if the book was added successfully
	 * 		  False if the parameter check failed(book to be added is null or the book array is full) or there is a duplicate, i.e. failure to add book
	 */
	public boolean addBook(Book book) 
	{
		
		if(books.length >= count || book == null) return false;
			
			for(int i = 0; i < count; i++)
			{
				if(books[i].equals(book))
				{
					return false;
				}
			}
			books[count] = new Book(book);
			count++;
			return true;
			
	}
	

	/** This is a method to remove a book from collection
	 * 
	 * @param book
	 * 		  book is the object we are looking to remove
	 * @return 
	 *        true if book is removed successfully
	 *        false if book failed param check, or the book cannot be found. (Book removal failure as a whole)
	 * 
	 */
	public boolean removeBook(Book book) 
	{
		if(book == null) return false;
		
		//iterate thru array to find book to remove
		for(int i = 0; i < count; i++)
		{
			//once the book is found everything will shift to the left
			if(books[i].equals(book)) 
			{
				for(int j = 0; j < count; j++) 
				{
					books[j] = books[j+1];
				}
				books[count - 1] = null;
				count--;
				return true;
			}
		}
		return false;
	}
	
	/** This method searchs for books via ISBN
	 * 
	 * @param ISBN
	 *		  ISBN of the book to be searched
	 * @return
	 * 		  returns the book found if ISBN matches with existing books
	 * 		  returns null if the book cannot be found with said ISBN or ISBN passed in was invalid
	 */
	public Book searchByISBN(String ISBN)
	{
		if(ISBN == null) return null;
		//iterates through book collection to try to match ISBN
		for(int i = 0; i < count; i++)
		{
			if(books[i].getISBN().equals(ISBN))
			{
				return new Book(books[i]);
			}
		}
		return null;
	}
	/**
	 * This method displays the books using toStrting
	 * 
	 * 
	 */
	
	
	public void displayBooks()
	{
		if(count == 0)
		{
			System.out.println("Library is empty.");
			return;
		}
		
		System.out.println("All books in the library:");
		for(int i = 0; i < count; i++)
		{
			System.out.println((i+1) + ". " + books[i].toString());
		}
	}
	
}
