package g18.library;
/**.
 * 
 * defines what a book should have
 */
public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private double price;
	//we don't want user to be able to change the contents of the book 
	//so we are using copy constructor to avoid changes to real content 
	//first construct some default data	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	//constructor with parameters pass in
	 public Book(String title, String author, String ISBN, double price) {
	        this.title = title;
	        this.author = author;
	        this.ISBN = ISBN;
	        this.price = price;
	    }
	//copy constructor to avoid illegal changes 
	 public Book(Book copy) {
		 this.title = copy.title;
		 this.author = copy.author;
		 this.ISBN = copy.ISBN;
		 this.price = copy.price;
		 
	 }
	
	 //getter and setter for title
	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	//getter and setter for author
	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	//getter and setter for isbn
	public String getISBN() 
	{
		return ISBN;
	}

	public void setISBN(String iSBN) 
	{
		ISBN = iSBN;
	}

	//getter and setter for price
	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		Book stuff = (Book) obj;
		//compare this to itself
		if(this == obj)
		{
			return true;
		}
		
		if(obj == null)
		{
			return false;
		}
		
		return this.ISBN.equals(stuff.ISBN);
	}
	
	
}


