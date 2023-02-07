package serialization;

import java.io.*;

class dog implements  Serializable{
	int j=10;
	int i=20;
}
public class serializationDemo {

	public static void main(String[] args) throws Exception {
		
  dog d=new dog();
  FileOutputStream fos= new FileOutputStream("abc.scr");
  
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(d);
  
 
  FileInputStream fis=new FileInputStream("abc.scr");
  ObjectInputStream ois=new ObjectInputStream(fis);
  dog d1=(dog) ois.readObject();
  System.out.println(d1.i+"      "+d1.j);
	}

}
