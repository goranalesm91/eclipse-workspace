package practiceMore;

public class polymorphism {

	public static void main(String[] args) {
		child1 p=new child1(23,"siddhu");
		p.student1();
		p.student1(22);
		p.student1("sager");
	}

}
class parent1{
	int age;
	String name;
	parent1(int age,String name){
		this.age=age;
		this.name=name;
	}
	void student1() {
		System.out.println(age+" "+name);
	}
	void student1(int age) {
		System.out.println(age+" "+name);
	}
	void student1(String name) {
		System.out.println(age+" "+name);
	}
}
class child1 extends parent1{
	child1(int age,String name){
		super(age,name);
	}
	void student1(int age) {
		System.out.println(name+ " child "+age);
	}
}
