package g18.Class;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	// default constructor
	public Book()
	{
		this.title ="Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	// construct to take in value 
		public Book(String title, String author, String ISBN, Double price)
		{
			this.title = title;
			this.author = author;
			this.ISBN = ISBN;
			this.price = price;
		}
		
		// copy constructor
		public Book(Book other)
		{
			this.title = other.title;
			this.author = other.author;
			this.ISBN = other.ISBN;
			this.price = other.price;
		}
		
		@Override
		public boolean equals(Object other)
		{
			Book book = (Book) other;
			if(this == other)
			{
				return true;
			}
			
			return this.ISBN.equals(book.ISBN);
		}
		
		@Override
		public String toString() {
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
