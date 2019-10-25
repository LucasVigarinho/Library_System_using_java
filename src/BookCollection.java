import java.util.ArrayList;

/** Creating a BookCollection class as a singleton class */
public class BookCollection {

	/** Creating the basics attributes of the class */
	private static BookCollection bookColl = null;
	/** Creating as well the final and unique instance,
	 * and also the array list, in order to manipulate 
	 * data collected from the external file */
	static ArrayList<Book> bookCollection;
	
	/** Creating the constructor of the class */
	private BookCollection() {
		bookCollection = new ArrayList<Book>();
	}//closing bookCollection constructor
	
	/** Creating the method getBookCollection, in order 
	 * to analyzing it and avoid more than one instance */
	public static BookCollection getBookCollection() {
		//created if statement as way to test if exist already open instance
		if (bookColl == null) {
			bookColl = new BookCollection();
		}//closing if statement
		return bookColl;
	}//closing getBookCollection
	
}//closing the class BookCollections
