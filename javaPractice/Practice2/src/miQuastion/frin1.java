package miQuastion;

import java.util.Arrays;

public class frin1 {

	public static void main(String[] args) {
		
		int ar[]= {0,-1,1,-3,3,2,-2,0,};
		Arrays.sort(ar);
		int ans[]=new int[ar.length];
		int i=0;
		int j=ar.length-1;
		int idx=ar.length-3;
		while(i<j &&idx>=0) {
			if(ar[i]==Math.abs(ar[j]) && ar[i]!=0 && ar[j]!=0) {
			ans[idx--]=ar[j++];
			ans[idx--]=ar[i--];
		}
	}
		for(int k=0;k<ans.length;k++) {
			System.out.print(ans[k]+" ");
		}
	}
}
