package Opps;
abstract class student{
	 abstract void  student1();
}


class s1 extends student{
     public   void    student1() {
		System.out.println("name");
//	return 11;
	}
}


public class Abstractoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        s1 s=new s1();
        s.student1();
//       System.out.print(s2);
	}

}
