package recordion;

public class ArraySum {
	
	public static int recursionSum(int ar[],int idx,int len) {
		if(idx==len) {
			return 0;
		}
//		if(idx==len-1) {
//			return ar[idx];
//		}
		int sum=recursionSum(ar,idx+1,len);
		return sum+ar[idx];
	}

	public static void main(String[] args) {
		
		
		int ar[]=new int[] {};
  int ans=recursionSum(ar,0,ar.length);
  System.out.print(ans);
	}

}
