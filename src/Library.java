/** importing the necessary java libraries  */
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Scanner;

/** Creating the library class*/
public class Library {

	/** Create the constant BOOK variable in order to identify when readying a txt file */
	private static final String BOOK = "book";
	private static final String MEMBER = "member";



	static ArrayList<Member> members = new ArrayList<>();

	/** Creating a method add in order to populate the array list from the main method*/
	public static void add() {
		readingData();

	}//closing add method

	/** Creating the reading Data Method */
	@SuppressWarnings("static-access")
	public static void readingData() {
		BookCollection bookCollection = BookCollection.getBookCollection();
		/** Creating the necessary objects */
		String fileNameBook = "saveBook.data";
		ObjectInputStream fileInBook;
		Book aBook;

		String fileNameMember = "saveMember.data";
		ObjectInputStream fileInMember;
		Member aMember;

		/** Open try and catch error message, in order to find the possible errors */ 
		try {
			//Initiating the objects created outside of the try and catch
			fileInBook = new ObjectInputStream(new FileInputStream(fileNameBook));
			aBook = (Book) fileInBook.readObject();

			//Creating a while loop to populate the array list apart from the save.data file, until is not empty
			while(aBook != null){
				//create the add product for populate
				bookCollection.bookCollection.add(aBook);
				aBook = (Book) fileInBook.readObject();
			}//closing while loop

			//Initiating the objects created outside of the try and catch
			fileInMember = new ObjectInputStream(new FileInputStream(fileNameMember));
			aMember = (Member) fileInMember.readObject();

			//Creating a while loop to populate the array list apart from the save.data file, until is not empty
			while(aMember != null){
				//create the add product for populate
				members.add(aMember);
				aMember = (Member) fileInMember.readObject();
			}//closing while loop

			fileInBook.close();
			fileInMember.close();

		}/** Create the catch fault for file not found, in order to give a opportunity to read a txt file */
		catch (FileNotFoundException e){
			System.err.println("Error: " + e.getMessage());
			readingTxt();

		}/** Create the IO exception, in order to receive a message in case of the no data in the file*/
		catch (IOException e){
			/** open an if statement in order to test if the book array list is empty or not */
			if(bookCollection.bookCollection.size() == 0) {
				System.err.println("Error: " + e.getMessage());

			}//closing if statement
		}/** Create the class not found exception, in order to receive a message in case of the no class was not found */
		catch (ClassNotFoundException e) {
			System.err.println("Class Error : " + e.getMessage());
		}//closing catch

	}//closing readingData method
	/** Creating the reading Txt Method in order initiate an empty system, only with the initial book */
	public static void readingTxt() {

		/** Creating the necessary object and variable in order to read the file */
		Scanner fileIn;
		String fileName = "initial.txt";

		/** Create a try and catch, in order to find the possible message errors */
		try {
			/** initiating the object created */
			fileIn = new Scanner(new FileReader(fileName));
			/** Creating a while loop in order to test if has next line in the file */
			while (fileIn.hasNextLine()) {
				/** creating a string variable, using the object fileIn created before, in order to reade next line */
				String line = fileIn.nextLine();
				String[] split = line.split(";");//split the line by ";" and stock in a array 

				String type = split[0];//read the first array block 0, in order to identify the class/object to be used

				/** Create a switch statement in order to identify the right class/object to be used  */
				switch (type) {
				case BOOK:
					Book book = new Book(Integer.parseInt(split[1].trim()), split[2].trim(),split[3].trim(),split[4].trim(), 
							Double.parseDouble(split[5].trim()),split[6].trim(), split[7].trim(),split[8].trim());
					BookCollection.bookCollection.add(book);
					break;
				case MEMBER:
					Member member = new Member(split[1].trim(), split[2].trim(), split[3].trim(), split[4].trim(), 
							Boolean.parseBoolean(split[5].trim()), split[6].trim(), split[7].trim(), split[8].trim());
					members.add(member);
					break;
				default:
					break;
				}//closing switch statement
			}//closing while loop
		}/** */
		catch(FileNotFoundException e) {
			System.err.print("\n\n\t" + e.getMessage());
		}//closing catch 

	}//closing reading Txt method



	/** creating the main method */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		/** Instantiating collections */
		BookCollection bookCollection = BookCollection.getBookCollection();

		/** Initiating the system using the add method created */
		Library.add();

		/** Creating the necessary variables and objects*/
		Scanner input = new Scanner(System.in);
		Scanner insert1 = new Scanner(System.in);
		Scanner insert2 = new Scanner(System.in);
		boolean exit = false;
		/** Creating the initial panel */

		System.out.println(" ");
		System.out.println(" ============================================================");
		System.out.println("                         MSC - LIBRARY                       ");
		System.out.println(" ============================================================");
		System.out.println("                                                             ");

		/** Creating a do loop, in order to make possible the functions */
		do {
			System.out.println("                        "                                 );
			System.out.println(" (1) NEW BOOK\t(3) RENT/RETURN BOOK\t(5) GENERATE REPORT" );
			System.out.println(" (2) NEW MEMBER\t(4) BOOK RECORD\t\t(6) MANAGE ISSUE"     );
			System.out.println("                        "                                 );
			System.out.print(" TYPE HERE YOUR OPTION => "                                 );

			//Creating a switch statement intern of the do loop, in order to give a sensation of an interacting system
			switch(input.nextInt()) {

			//First case is the NEW BOOK
			case(1):
				Book newBook = new Book (((bookCollection.bookCollection.size()+1)), "xyw", "Lucas", "xys.png", 5000, "rented", "25/10/2019", "25/11/2019" );
			BookCollection.bookCollection.add(newBook);

			break;
			//Second case is the NEW MEMBER
			case(2):
				break;
			//Third case is the RENT/RETURN BOOK
			case(3):
				break;
			//Fourth case is the BOOK RECORD
			case(4):

				//Fifth case is the GENERATE REPORT

				/** Print out all the books */

				for (int i = 0; i < (bookCollection.bookCollection.size()); i++) {
					System.out.println("\n\t" + 
							"BookId - " + bookCollection.bookCollection.get(i).getBookId() + "\n" +
							"BookTitle - " + bookCollection.bookCollection.get(i).getBookTitle() + "\n" +
							"BookAutor - " + bookCollection.bookCollection.get(i).getBookAutor() + "\n" +
							"BookCover - " + bookCollection.bookCollection.get(i).getBookCover() + "\n" +
							"BookPrice - " + bookCollection.bookCollection.get(i).getPrice() + "\n" +
							"BookSituation - " + bookCollection.bookCollection.get(i).getSituation() + "\n" +
							"BookRentDate - " + bookCollection.bookCollection.get(i).getRentDate() + "\n" +
							"BookRentReturn - " + bookCollection.bookCollection.get(i).getRentReturn() + "\n");
				}
			break;
			case(5):
				break;
			//Sixth case is the MANAGE ISSUE
			case(6):
				exit = true;
			break;
			default:

			}//closing if statment
		}while(exit == false);


	}//closing the main method



}//closing library class
