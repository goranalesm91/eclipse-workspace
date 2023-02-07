package constructer;

public class construct1 {
		  int age;
		String name;
		construct1(int age ,String name){
			this.name=name;
		   this.age=age;
			 
		 }
		
		public void print() {
			System.out.println(name);
			System.out.println(age);
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		construct1 k=new construct1(10,"siddhu");

		k.print();
		System.out.println(k.name);
	}

}
