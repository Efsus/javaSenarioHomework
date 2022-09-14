package javaSenarioHomework.Concrete;

import java.rmi.RemoteException;

import javaSenarioHomework.Abstract.BaseCustomerManager;
import javaSenarioHomework.Abstract.ICustomerCheckService;
import javaSenarioHomework.Abstract.ICustomerService;
import javaSenarioHomework.Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager  {
	
	ICustomerCheckService customerCheckService;
	
	public StarBucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) throws Exception {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else{
			System.out.println("Not a valid person.");
		}
		
	}
}
