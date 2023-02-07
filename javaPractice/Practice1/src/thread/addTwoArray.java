package thread;

public class addTwoArray {

	public static void main(String[] args) {
	int ar1[]=new int[] {4, 9, 13, 20, 30};
int ar2[] = new int[] {1, 3, 10, 15, 25};

int ans[]=new int[ar1.length+ar2.length];
  int i=0;
  int j=0;
  int k=0;
  while(k<ans.length &&i<ar1.length && j<ar2.length) {
	  if(ar1[i]>ar2[j]) {
		  ans[k]=ar2[j];
		  j++;
		  k++;
	  }else {
		  ans[k]=ar1[i];
		  i++;
		  k++;
	  }
  }
 
  if(i<ar1.length) {
	 
	  while(i<ar1.length) {
		  ans[k]=ar1[i];
		  i++;
		  k++;
	  }
  }
  if(j<ar2.length) {
		 
	  while(j<ar2.length) {
		  ans[k]=ar1[j];
		  j++;
		  k++;
	  }
  }
  for(i=0;i<ans.length;i++) {
	  System.out.print(ans[i]+" ");
  }
	}

}
