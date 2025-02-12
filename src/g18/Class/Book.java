package g18.Class;


public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	// default construct
	public Book()
	{
		this.title ="Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	// construct to take in value 
	public Book(String title, String author, String ISBN, double price)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	// copy constructor
	public Book(Book book)
	{
		this.title = book.title;
		this.author = book.author;
		this.ISBN = book.ISBN;
		this.price = book.price;
	}

	/**
	 * This is a parameterized equals method that checks to see if two books have the same ISBN. 
	 * @param other
	 * 			This argument is a book object to compare against
	 * @return
	 * 			Returns true if two books have the same ISBN. 
	 * 			Returns false if two books do not have the same ISBN.
	 */
	@Override
	public boolean equals(Object other) {
		if(other == null) {
			return false;
		}
		if(this.ISBN.equals(((Book)other).ISBN)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString()
	{
		return title + " by " + author + " (ISBN: " + ISBN + ", $" + price + ")";
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
