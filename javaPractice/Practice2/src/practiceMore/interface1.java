package practiceMore;

public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("pune");
		s.name();
		s.age();
	System.out.println(s.city());	
		System.out.println(s.city("china"));

	}

}
class Student implements  Int2{
	String name;
	public Student(String name) {
		this.name=name;
	}
	public void name() {
		System.out.println("Siddhu");
	}
	public void age() {
		System.out.println(23);
	}
	public String city(String name) {
		return name;
	}
	public String city() {
		return name;
	}
}
interface Int1{
	public void name();
	public void age();
}
interface Int2 {
	public String city();
}
