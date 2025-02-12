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
	
	//to add a book to collection ,if max amount of books reached return false, else we add the book and increase book counts
	/**
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
	
	//to remove a book from collection, returns true if book found and removed and false when book is not found
	public boolean removeBook(Book book) 
	{
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
	
	//functionality is in the name
	public Book searchByISBN(String ISBN)
	{
		for(int i = 0; i < count; i++)
		{
			if(books[i].getISBN().equals(ISBN))
			{
				return books[i];
			}
		}
		return null;
	}
	
	public void displayBooks()
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println(books[i].toString());
		}
	}
	
}
