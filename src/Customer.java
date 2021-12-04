
public class Customer implements ICustomer{
	
	int id;
	String firstName;
	String lastName;
	int dateOfBirth;
	String nationalityId;
	
	public Customer(int id, String firstName, String lastName,int dateOfBirth, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
		
	}
	
	

}
