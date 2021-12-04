import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckManager customerCheckManager;


	public StarbucksCustomerManager(ICustomerCheckManager customerCheckManager){
		this.customerCheckManager = customerCheckManager;
	}

		
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if(customerCheckManager.isRealPerson(customer)) {
			System.out.println("Kimlik Doðrulandý");
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
			
		}
		
	}

	
	
}
