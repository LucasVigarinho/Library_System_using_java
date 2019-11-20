
/** Creating a user class **/
public class Staff extends Member{

	//create the default attributes
	private String position;
	private String until;
	private String password;
	private boolean staffA;
	
	//create the constructor
	public Staff(String memberId, String memberName, String memberAddress, 
			  String since, boolean staffA, String position, String until, String password ) {
		super(memberId, memberName,memberAddress,since);
		this.position = position;
		this.until = until;
		this.password = password;
		this.staffA = staffA;
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
	/** Created a getter for getting the boolean of the StaffA situation */
	public boolean getStaffA() {
		return staffA;
	}//closing getStaffA
	/** Created a getter for getting the situation of the Staff */
	public void setStaffA(boolean staffA) {
		this.staffA = staffA;
	}//closing setStaffA
	
	
}//closing the class member
