package serializable.co.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Reademployee {

	
	public static void main(String[] args) throws Exception {
		FileInputStream f =new FileInputStream("d:/iojava/piyush.ser");
		ObjectInputStream in = new ObjectInputStream (f);
		Employee emp = (Employee)in.readObject();
		System.out.println(emp.getId());
		System.out.println(emp.getFirstname());
		System.out.println(emp.getLastname());
		System.out.println(emp.getAddress());
		System.out.println(emp.getPassword());
		
		
	}

}
