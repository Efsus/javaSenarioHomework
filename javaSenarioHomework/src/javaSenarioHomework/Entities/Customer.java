package javaSenarioHomework.Entities;

import java.time.LocalDate;

import javaSenarioHomework.Abstract.IEntity;

public class Customer implements IEntity {
	
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
	public String nationalityId;
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		
	}
	
	
	

}
