package serialization;


import java.io.*;

class Dogy implements Serializable{
	Dogy1 d2=new Dogy1();
	int i=30;
}
class Dogy1 implements Serializable{
	Dogy2 d3=new Dogy2();
	int i=30;
}

class Dogy2 implements Serializable{
	int i=30;
}

public class serializationGraph {

	public static void main(String[] args) throws Exception{
		
		
      Dogy d=new Dogy();
  
  
  FileOutputStream s=new FileOutputStream("siddhu.jd");
  ObjectOutputStream oos=new ObjectOutputStream(s);
  oos.writeObject(d);
  
  FileInputStream s1=new FileInputStream("siddhu.jd");
  ObjectInputStream ois=new ObjectInputStream(s1);
  Dogy d1=(Dogy)ois.readObject();
  System.out.println(d1.d2.i);
	}

}
