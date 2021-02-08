package serializable.co.in;

import java.io.Serializable;

public class Employee implements Serializable {

	
	
	private int id;
	private String firstname;
	private String lastname;
	private String Address;
	private transient String password;
	public Employee(){}
	public Employee(int id, String firstname,String lastname,String address){
		this.id = id;
		this.firstname = firstname;
		this.lastname =lastname;
		
		
				
	}
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getAddress() {
		return Address;
	}
	public String getPassword() {
		return password;
	}
	
	

	}


