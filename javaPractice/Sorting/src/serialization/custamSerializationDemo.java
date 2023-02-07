package serialization;

import java.io.*;

class Account implements Serializable{
	String name="Siddharam";
	transient String  pass="Siddhu";
	
	
	private void writeObject(ObjectOutputStream os)throws Exception{
		os.defaultWriteObject();
		String epas="123"+pass;
		os.writeObject(epas);
		
	}
private void readObject(ObjectInputStream is)throws Exception{
		is.defaultReadObject();
		String epas=(String)is.readObject();
		pass=epas.substring(3);
	}
}

public class custamSerializationDemo {

	public static void main(String[] args) throws Exception {
	
  Account a=new Account();
  
 System.out.println(a.name+"    "+a.pass);
 
 FileOutputStream fis=new FileOutputStream("Siddhu.sa");
 ObjectOutputStream oos=new ObjectOutputStream(fis);
 oos.writeObject(a);
 
 
 FileInputStream fos=new FileInputStream("Siddhu.sa");
 ObjectInputStream oip=new ObjectInputStream(fos);
 Account a2=(Account)oip.readObject();
 
 
 System.out.println(a2.name+"    "+a2.pass);
 
 
	}

}
