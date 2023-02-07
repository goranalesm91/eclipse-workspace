package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[]= {10,34,20,29,40,9,4,};
		int min;
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			min=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]<ar[min]){
					min=j;
					
				}
			}
			temp=ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
			System.out.println(ar[i]);
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
