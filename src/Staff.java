
/** Creating a user class **/
public class Staff extends Member{

	//create the default attributes
	private String position;
	private String until;
	private String password;
	
	//create the constructor
	public Staff(int memberId, String memberName, String memberAddress, 
			  String since, String position, String until, String password ) {
		super(memberId, memberName,memberAddress,since);
		this.position = position;
		this.until = until;
		this.password = password;
	}//close the constructor

	/** Created a getter for getting the position of the Staff */
	public String getPosition() {
		return position;
	}//closing getPosition 
	/** Created a setter for setting or update the position of the Staff */
	public void setPosition(String position) {
		this.position = position;
	}//closing setPOsition 
	/** Created a getter for getting the until (last day) of the Staff */
	public String getUntil() {
		return until;
	}//closing getUntil
	/** Created a setter for setting the until (last day) of the Staff */
	public void setUntil(String until) {
		this.until = until;
	}//closing setUntil
	/** Created a getter for getting the password of the Staff */
	public String getPassword() {
		return password;
	}//closing getPassword
	/** Created a setter for setting the password of the Staff */
	public void setPassword(String password) {
		this.password = password;
	}//closing setPassword
	
	
	
}//closing the class member
