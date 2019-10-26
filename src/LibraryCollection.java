import java.util.ArrayList;

/** Creating a BookCollection class as a singleton class */
public class LibraryCollection {

	/** Creating the basics attributes of the class */
	private static LibraryCollection bookColl = null;
	/** Creating as well the final and unique instance,
	 * and also the array list, in order to manipulate 
	 * data collected from the external file */
	public static ArrayList<Book> booksCollection;
	public static ArrayList<Member> membersCollection;
	/** Creating the constructor of the class */
	private LibraryCollection() {
		booksCollection = new ArrayList<Book>();
		membersCollection = new ArrayList<Member>();
	}//closing bookCollection constructor
	
	/** Creating the method getBookCollection, in order 
	 * to analyzing it and avoid more than one instance */
	public static LibraryCollection getBookCollection() {
		//created if statement as way to test if exist already open instance
		if (bookColl == null) {
			bookColl = new LibraryCollection();
		}//closing if statement
		return bookColl;
	}//closing getBookCollection
	
}//closing the class BookCollections
