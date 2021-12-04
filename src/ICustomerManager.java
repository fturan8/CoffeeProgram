import java.rmi.RemoteException;

public interface ICustomerManager {
	abstract void save(Customer customer) throws NumberFormatException, RemoteException;
	
}
