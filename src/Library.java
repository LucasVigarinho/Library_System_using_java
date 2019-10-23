/** importing the necessary java libraries  */
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.FileReader;
/** Creating the library class*/
public class Library {

	/** Create the constant BOOK variable in order to identify when readying a txt file */
	private static final String BOOK = "book";
	
	
	/** Creating an ArrayList in order to facilitate the manipulation of data */
	static ArrayList<Book> books = new ArrayList<>();
	
	/** Creating a method add in order to populate the array list from the main method*/
	public static void add() {
		readingData();
		
	}//closing add method
	
	/** Creating the reading Data Method */
	public static void readingData() {
		
		/** Creating the necessary objects */
		String fileName = "save.data";
		ObjectInputStream fileIn;
		Book aBook;
		
		/** Open try and catch error message, in order to find the possible errors */ 
		try {
			//Initiating the objects created outside of the try and catch
			fileIn = new ObjectInputStream(new FileInputStream(fileName));
			aBook = (Book) fileIn.readObject();
			
			//Creating a while loop to populate the array list apart from the save.data file, until is not empty
			while(aBook != null){
				//create the add product for populate
				books.add(aBook);
				aBook = (Book) fileIn.readObject();
			}//closing while loop
			
			fileIn.close();
		}/** Create the catch fault for file not found, in order to give a opportunity to read a txt file */
		catch (FileNotFoundException e){
			System.err.println("Error: " + e.getMessage());
			readingTxt();
			
		}/** Create the IO exception, in order to receive a message in case of the no data in the file*/
		catch (IOException e){
			/** open an if statement in order to test if the book array list is empty or not */
			if(books.size() == 0) {
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
					Book book = new Book(Integer.parseInt(split[1].trim()), split[2].trim(),split[3].trim(),split[4].trim());
					books.add(book);
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
	
	
}//closing library class
