/** Creating the book class */
public class Book {
	
	private int bookId;
	private String bookTitle;
	private String bookAutor;
	private String bookCover;
	private double price;
	private String situation;
	
	/** Create a book constructor */
	public Book(int bookId, String bookTitle, String bookAutor, String bookCover, double price, String situation){
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAutor = bookAutor;
		this.bookCover = bookCover;
		this.price = price;
		this.situation = situation;
	}//closing book constructor

	/** Create a getter getBookId, for getting bookId data */
	public int getBookId() {
		return bookId;
	}//closing getBookId
	
	/** Create a getter getBookTitle, for getting bookTitle data */
	public String getBookTitle() {
		return bookTitle;
	}//closing getBookTitle
	
	/** Create a getter getBookAutor, for getting bookAutor data */
	public String getBookAutor() {
		return bookAutor;
	}//closing getBookTitle

	/** Create a getter getBookCover, for getting bookCover data */
	public String getBookCover() {
		return bookCover;
	}//closing getBookCover

	/** Create a setter setBookCover, for setting bookCover data or update */
	public void setBookCover(String bookCover) {
		this.bookCover = bookCover;
	}//closing setBookCover
	/** Create a getter getPrice for getting price */
	public double getPrice() {
		return price;
	}//
	/** Create a getter getSituation for getting situation of rent or lost */
	public String getSituation() {
		return situation;
	}//
	/** Create a setter setSituation for setting situation when it changes */
	public void setSituation(String situation) {
		this.situation = situation;
	}//
	
	
	
}//creating a book class
