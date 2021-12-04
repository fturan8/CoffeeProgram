import java.rmi.RemoteException;

public interface ICustomerCheckManager {
	
	boolean isRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
