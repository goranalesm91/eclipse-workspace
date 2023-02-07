package swap;
import java.util.Scanner;

public class DoNottakeThirdvar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      System.out.print("enter nomber1");
      int a=sc.nextInt();
      System.out.print("enter nomber2");
      int b=sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.print(a+" "+b);
	}

}
