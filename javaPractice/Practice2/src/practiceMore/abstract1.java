package practiceMore;

public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employ e=new employ(12,"siddhu");
		e.details();
	}

}
abstract class person{
	int age;
	String name;
	public person(int age,String name) {
		this.age=age;
		this.name=name;
	}
	abstract public void details() ;
		
}
class employ extends person{
	employ(int age, String name){
		super(age,name);
	}
	public void details() {
		System.out.println(age+" "+name);
	}
}
