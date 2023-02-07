package sort;


public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,10,34,56,12,2,3,4,1,9};
		
		for(int i=0;i<ar.length;i++) {
			int flag=1;
			for(int j=0;j<ar.length-1-i;j++) {
				
		if(ar[j]>ar[j+1]) {
			int temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
			flag=0;
			System.out.println(temp);
		}
			}
			if(flag==1) {
				break;
			}
	}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
//		System.out.println(c+ "output");

	}
	}
