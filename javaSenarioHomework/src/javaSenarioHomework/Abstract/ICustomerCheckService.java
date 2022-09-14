package javaSenarioHomework.Abstract;

import java.rmi.RemoteException;

import javaSenarioHomework.Entities.Customer;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer) throws Exception;

}
