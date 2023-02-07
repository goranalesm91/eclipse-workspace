package serialization;

//import java.beans.Transient;
import java.io.*;

class Man implements Serializable{
	   String name;
	 int age;
	public Man(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	
}
class Man1 extends Man2 {

		
	}

class Man2 implements Serializable{
	 transient final static String name="siddhu";
	transient int age=20;
	
}

public class transiantAndFinalUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Man m=new Man("siddhu",25);
		Man1 m1=new Man1();
		Man2 m2=new Man2();
		FileOutputStream fos=new FileOutputStream("abc.si");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);


		oos.writeObject(m);

		oos.writeObject(m1);

		oos.writeObject(m2);
FileInputStream fis=new FileInputStream("abc.si");

		ObjectInputStream ois=new ObjectInputStream(fis);
		
		
		Man m3=(Man)ois.readObject();

		

		
		Man1 m4=(Man1)ois.readObject();
		
		Man2 m5=(Man2)ois.readObject();

		
		System.out.println(m3.name+"    "+m3.age);
		
		System.out.println(m4.name+"    "+m4.age);
		
		System.out.print(m5.name+"    "+m5.age);

	}

}
