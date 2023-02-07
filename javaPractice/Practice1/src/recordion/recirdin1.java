package recordion;

public class recirdin1 {
   public static int rec(int n) {
	  if(n==0) {
		  return 0;
	  }
	  System.out.println(n);
	  return  rec(n-1);
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
  System.out.println(rec(5));
	}

}
