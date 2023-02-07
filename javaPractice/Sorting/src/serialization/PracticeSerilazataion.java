package serialization;

import java.io.*;

class Cat implements Serializable{
	 String name="Siddharam";
	transient final int age=20;
}
public class PracticeSerilazataion {

	public static void main(String[] args) throws Exception{
	
		Cat c=new Cat();
		FileOutputStream fis=new FileOutputStream("Siddhu.scr");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		 oos.writeObject(c);
		 
		 
		 FileInputStream f=new FileInputStream("Siddhu.scr");
		 ObjectInputStream oip=new ObjectInputStream(f);
		 Cat c1=(Cat)oip.readObject();
		 
		System.out.println(c1.name+"---------"+c1.age);
	}

}
