

import java.io.*;

class Dog1 implements Serializable{
	Cat c=new Cat();
}
class Cat  implements Serializable{
	Ratt r=new Ratt();
}
class Ratt  implements Serializable{
	 int j=50;
}
public class serializationGraph {

	public static void main(String[] args) throws Exception{
      Dog1 d=new Dog1();
  
  
  FileOutputStream s=new FileOutputStream("siddhu.jd");
  ObjectOutputStream oos=new ObjectOutputStream(s);
  oos.writeObject(d);
  
  FileInputStream s1=new FileInputStream("siddhu.jd");
  ObjectInputStream ois=new ObjectInputStream(s1);
  Dog1 d1=(Dog1) ois.readObject();
  System.out.println(d1.c.r.j);
	}

}
