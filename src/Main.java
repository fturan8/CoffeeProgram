import java.rmi.RemoteException;


public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		customerManager.save(new Customer(1, "Fýrat", "Turan", 1995, "12345678901")); //Kimlik numaraný doðru yazýnca çalýþýyor.
		
		BaseCustomerManager customerManager1 = new NeroCustomerManager();
		customerManager1.save(new Customer(1, "Fýrat", "Turan", 1995, "12345678901"));

	}

}
