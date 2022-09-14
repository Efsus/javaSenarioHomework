package javaSenarioHomework;

import java.rmi.RemoteException;
import java.sql.Date;
import java.time.LocalDate;

import javaSenarioHomework.Abstract.BaseCustomerManager;
import javaSenarioHomework.Adapters.MernisServiceAdapter;
import javaSenarioHomework.Concrete.NeroCustomerManager;
import javaSenarioHomework.Concrete.StarBucksCustomerManager;
import javaSenarioHomework.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager = new StarBucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Yusuf","Gökdoğan",LocalDate.of(2006, 7, 27),"11100027620"));
		System.out.println();
	}

}
