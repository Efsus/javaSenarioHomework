package javaSenarioHomework.Abstract;

import java.rmi.RemoteException;

import javaSenarioHomework.Entities.Customer;

public interface ICustomerService {
	
	void Save(Customer customer) throws Exception;

}
