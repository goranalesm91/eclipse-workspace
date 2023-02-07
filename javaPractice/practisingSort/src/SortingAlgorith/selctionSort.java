package SortingAlgorith;

public class selctionSort {

	public static void main(String[] args) {
		int ar[]=new int[] {5,2,12,3,7,1,8};
		int len=ar.length;
		for(int i=0;i<len;i++) {
		 for(int j=i;j<len;j++) {
			 int idx=0;
			 if(ar[i]>ar[j]) {
				 i=j;
			 }
			 int temp=ar[idx];
			 ar[idx]=ar[i];
		 }
		}
	}

}
