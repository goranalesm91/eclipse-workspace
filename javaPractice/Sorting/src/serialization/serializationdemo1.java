package serialization;
import java.util.*;
import java.io.*;

class test extends name implements Serializable{
 transient	final int a=20;
 transient static 	String  c="siddhu";
}
class name {
	int a1=30;
	
}

public class serializationdemo1 {

	public static void main(String[] args) throws Exception {
				test t=new test();
		FileOutputStream fis=new FileOutputStream("si.js");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(t);
		
		
		FileInputStream fos=new FileInputStream("si.js");
		ObjectInputStream ois=new ObjectInputStream(fos);
		test t1=(test)ois.readObject();
		
		System.out.println(t1.a+"    "+t1.c+    "===="+t1.a1);
	}

}
