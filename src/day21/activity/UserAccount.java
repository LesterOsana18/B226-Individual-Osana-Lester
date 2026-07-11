// Activity 14: User Account Registration
// Encapsulation & User Input
package day21.activity;

public class UserAccount {
	
	// Declare variables/fields
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String email;
	private String password;
	
	// Parameterized constructor
	public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	
	// Setter Methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Getter Methods
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
}
