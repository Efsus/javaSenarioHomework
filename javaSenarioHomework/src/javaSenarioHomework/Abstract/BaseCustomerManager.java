package javaSenarioHomework.Abstract;

import java.rmi.RemoteException;

import javaSenarioHomework.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	
	public void Save(Customer customer) throws Exception {
		System.out.println("Saved to db : " + customer.firstName);
		
	}

}
