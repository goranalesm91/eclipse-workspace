package SortingAlgorith;

import java.util.Iterator;

public class BubbleSort {

	public static void main (String []args) {
		int ar[]=new int[] {5,2,12,3,7,1,8};
		int len=ar.length;

for(int i=0;i<len-1;i++) {
	for(int j=i;j<len;j++) {
		if(ar[i]>ar[j]) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
	
	}
}
for(int ans:ar) {
	System.out.print(ans+" ");
	}
}
}


