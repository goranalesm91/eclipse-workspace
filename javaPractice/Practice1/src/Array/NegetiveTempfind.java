package Array;

public class NegetiveTempfind {

	  public static int numberofIdx(int ar[]) {
		  int count =0;
		  for(int i=0;i<ar.length;i++) {
			  if(ar[i]<0) {
				  count++;
			  }
			  
		  }
		  return count; 
	  }
	public static void main(String[] args) {
    int ar[]=new int[] {9,-3,8,-6,-7,8,10};
    int ans= numberofIdx(ar);
    System.out.println(ans);
	}

}
