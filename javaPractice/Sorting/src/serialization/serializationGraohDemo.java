package serialization;
import java.io.*;


class Graph1 implements Serializable{
	Graph2 g1=new Graph2();
	transient	String age="20";
}

class Graph2 implements Serializable{
	Graph3 g2=new Graph3();
	transient	String age="20";

}

class Graph3 implements Serializable{
	String name="Siddharam";
}
public class serializationGraohDemo {

	public static void main(String[] args) throws Exception{
		Graph1 g=new Graph1();
		FileOutputStream fos=new FileOutputStream("Sid.j");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		
		FileInputStream fis=new FileInputStream("Sid.j");
		ObjectInputStream ois=new ObjectInputStream(fis);
       Graph1 gh=(Graph1)ois.readObject();
       
       
       System.out.println(gh.g1.g2.name+"    "+gh.g1.age);
		
		


	}

}