package recordion;
import java.util.*;

public class sumOfCubeEqulToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
      int ans=0;
      int temp=n;
    while(n!=0) {
    	int rem=n%10;
//    	System.out.println(rem);
    	ans+=rem*rem*rem;
    	n=n/10;
//    	System.out.println(n);
    }
    if(temp==ans)
    System.out.println(true);
    else
    	System.out.println(false);
	}

}
