/** Creating the book class */
public class Book {
	
	private int bookId;
	private String bookTitle;
	private String bookAutor;
	private String bookCover;
	private double price;
	private String situation;
	private String rentDate;
	private String rentReturn;
	
	/** Create a book constructor */
	public Book(int bookId, String bookTitle, String bookAutor, String bookCover, double price, String situation, String rentDate, String rentReturn){
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAutor = bookAutor;
		this.bookCover = bookCover;
		this.price = price;
		this.situation = situation;
		this.rentDate = rentDate;
		this.rentReturn = rentReturn;
		
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
	}//closing getPrive
	/** Create a getter getSituation for getting situation of rent or lost */
	public String getSituation() {
		return situation;
	}//closing getSituation
	/** Create a setter setSituation for setting situation when it changes */
	public void setSituation(String situation) {
		this.situation = situation;
	}//closing setSituation
	/** Create a getter rentDate for setting situation when it changes */
	public String getRentDate() {
		return rentDate;
	}//closing 
	/** Create a setter setRentDate for setting the date of the rent */
	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}//closing 
	/** Create a getter getRentReturn for getting rent date for book return when it changes */
	public String getRentReturn() {
		return rentReturn;
	}//closing 
	/** Create a setter setTentReturn for setting date of book return when it changes */
	public void setRentRetur(String rentReturn) {
		this.rentReturn = rentReturn;
	}//closing 
	
}//creating a book class
