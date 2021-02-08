package serializable.co.in;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Testemployee {

	
	public static void main(String[] args) throws Exception {
		FileOutputStream f= new FileOutputStream("d:/iojava/piyush.ser");
		ObjectOutputStream ot = new ObjectOutputStream(f);
		Employee emp = new Employee (12,"Kavita","Sharma","36 b saraswati nagar");
	ot.writeObject(emp);
	ot.close();
	System.out.println("object is successfully present");
	}

}
