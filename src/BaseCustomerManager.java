import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerManager{

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Saved to db " + customer.firstName);	
		
	}

}
