package practiceMore;

public class AccesessVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch=new child(15);
		System.out.println(ch.age);

	}

}
class parent{
	int age;
	parent(int age){
		this.age=age;
	}
}
class child extends parent{
	
	child(int age){
		super(age);
	}
}
