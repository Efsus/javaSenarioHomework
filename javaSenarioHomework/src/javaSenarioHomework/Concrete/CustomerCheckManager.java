package javaSenarioHomework.Concrete;

import javaSenarioHomework.Abstract.ICustomerCheckService;
import javaSenarioHomework.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}

	

}
