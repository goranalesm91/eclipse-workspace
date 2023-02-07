package recordion;

public class fibanchi {
	public static int fibnachi(int n) {
		if(n==1) {
			return 1;
			
		}
		int smallFact=fibnachi(n-1);
		return smallFact*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int ans=	fibnachi(5);
	System.out.println(ans);
	}

}
