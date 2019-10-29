/** Creating a user class **/
public class Member {

	//create the default attributes
	private String memberId;
	private String memberName;
	private String memberAddress;
	private String since;
	private boolean staffA;
	private String position;
	private String until;
	private String password;
	
	//create the constructor
	public Member(String memberId, String memberName, String memberAddress, String since, boolean staffA,  String position, String until, String password) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.since = since;
		this.staffA = staffA;
		this.position = position;
		this.until = until;
		this.password = password;
	}//close the constructor

	/** Create a getter for getting the member Id  (as e-mail) */
	public String getMemberId() {
		return memberId;
	}//closing getMemberId
	/** Create a setter for setting the member Id (as e-mail) or update */
	public void setMemberId(String memberId) {
		 this.memberId = memberId;
	}//closing setMemberId
	/** Create a getter for getting the member name */
	public String getMemberName() {
		return memberName;
	}//closing getMemberName

	/** Create a getter for getting member address*/
	public String getMemberAddress() {
		return memberAddress;
	}//closing getMemberAddress
	/** Create a setter for setting a member address, giving the opportunity to change or update address*/
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}//closing getMemberAddress
	/** Create a getter for getting date of since */
	public String getSince() {
		return since;
	}//closing getSince
	/** Create a getter for getting member situation*/
	public boolean getStaffA() {
		return this.staffA;
	}//closing getMemberAddress
	/** Create a setter for setting a member address, giving the opportunity to change or update address*/
	public void setStaffA(boolean staffA) {
		this.staffA = staffA;
	}//closing getMemberAddress
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
