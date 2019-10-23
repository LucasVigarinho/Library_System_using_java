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
	private static final String MEMBER = "member";
	
	
	/** Creating the ArrayList in order to facilitate the manipulation of data */
	static ArrayList<Book> books = new ArrayList<>();
	static ArrayList<Member> members = new ArrayList<>();
	
	/** Creating a method add in order to populate the array list from the main method*/
	public static void add() {
		readingData();
		
	}//closing add method
	
	/** Creating the reading Data Method */
	public static void readingData() {
		
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
				books.add(aBook);
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
	public static void main(String[] args) {
		
		/** Initiating the system using the add method created */
		Library.add();
		
	}//closing the main method
	
	
	
}//closing library class
