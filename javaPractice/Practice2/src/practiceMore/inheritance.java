package practiceMore;

public class inheritance {

	public static void main(String[] args) {
			Auto car=new Auto(4,"red","tata");
			car.color();
	}

}
class Vahical{
	int weels;
	String color;
	public Vahical(int weels,String color){
		this.color=color;
		this.weels=weels;
	}
	public void color() {
System.out.println(color);	
}
	
}
class Car extends Vahical{
	Car(int weels,String color ){
		super(weels,color);
	}
	public void color() {
		System.out.println("car color method");
		super.color();
	}
}
class Auto extends Vahical{
	String compny;
	Auto(int weels, String color,String compny){
		super(weels,color);
		this .compny=compny;
	}
	public void color() {
		System.out.println("car compny "+compny);
	}
}
