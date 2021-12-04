import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor  implements ICustomerCheckManager{
	
	
	@Override
	public boolean isRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy publicSoapProxy = new KPSPublicSoapProxy();
		return publicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);

	}

}
