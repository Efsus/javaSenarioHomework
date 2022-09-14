package javaSenarioHomework.Adapters;

import javaSenarioHomework.Abstract.ICustomerCheckService;
import javaSenarioHomework.Entities.Customer;
import MernisReferenceService.*;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Integer.parseInt(customer.nationalityId),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth.getYear());
		
	}

}
