/** Creating the book class */
public class Book {
	
	private int bookId;
	private String bookTitle;
	private String bookAutor;
	private String bookCover;
	
	/** Create a book constructor */
	public Book(int bookId, String bookTitle, String bookAutor, String bookCover){
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAutor = bookAutor;
		this.bookCover = bookCover;
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
	
	
	
}//creating a book class
