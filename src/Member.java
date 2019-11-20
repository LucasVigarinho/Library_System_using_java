/** Creating a user class **/
public class Member {

	//create the default attributes
	private String memberId;
	private String memberName;
	private String memberAddress;
	private String since;

	
	//create the constructor
	public Member(String memberId, String memberName, String memberAddress, String since) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.since = since;

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
	
	
	
	
}//closing the class member
