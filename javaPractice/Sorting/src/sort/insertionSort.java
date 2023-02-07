package sort;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {3,4,2,5,4,3,7,8};
int j,temp;
	for(int i=1;i<ar.length;i++) {
		temp=ar[i];//4 ,2
		j=i; //1 2
		while(j>0&&ar[j-1]>temp) {
			ar[j]=ar[j-1];
			j=j-1;
		
		}
		ar[j]=temp;
	}
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
	}

}
