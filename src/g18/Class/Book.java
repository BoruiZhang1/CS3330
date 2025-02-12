package g18.Class;


public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private Double price;
	
	// default construct
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
	public Book(BookClass book)
	{
		this.title = book.title;
		this.author = book.author;
		this.ISBN = book.ISBN;
		this.price = book.price;
	}
	
	public String toString()
	{
		return "BookClass [title =" + title +  ", author = " + author + ", ISBN = " + ISBN + ", Price = " + price +"]";
		
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
