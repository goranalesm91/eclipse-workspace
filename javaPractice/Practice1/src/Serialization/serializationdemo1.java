package Serialization;
import java.io.*;
class test implements Serializable{
	 transient int ans=123;
}

public class serializationdemo1 {

	public static void main(String[] args) throws Exception{
		
		test t=new test();
     FileOutputStream fos=new FileOutputStream("Siddhu.html");
     
       ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(t);
     
     
     FileInputStream fis =new FileInputStream("Siddhu.html");
     
     ObjectInputStream ois=new ObjectInputStream(fis);
     
    test t2=(test)ois.readObject();
    System.out.print(t2.ans);;
    

	}

}
