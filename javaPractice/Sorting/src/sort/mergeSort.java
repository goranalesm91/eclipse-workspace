package sort;

public class mergeSort {

	public static void main(String[] args) {
		int ar[]= {3,4,56,6,4,3,5,6,7};
	 divid(ar,0,ar.length-1);
	 for(int i=0;i<ar.length;i++) {
		 System.out.print(ar[i]+" ");
	 }

	}
	public static void divid(int ar[],int l,int r) {
		if(l>=r) {
			return;
		}
			int mid =(l+r)/2;
			divid(ar,l,mid);
			divid(ar,mid+1,r);
			conker(ar,l,mid,r);
			return;
		
	}
	public static void conker(int ar[],int l,int mid,int r) {
		int marged[]=new int[r-l+1];
		int idx1=l;
		int idx2=mid+1;
		int k=0;
		while(idx1<=mid && idx2<=r) {
			if(ar[idx1]<=ar[idx2]) {
				marged[k++]=ar[idx1++];
				
			}else {
				marged[k++]=ar[idx2++];
			}
		}
		while(idx1<=mid) {
			marged[k++]=ar[idx1++];
		}
		while(mid<=r) {
			marged[k++]=ar[idx2++];
		}
		for(int i=0,j=l;i<marged.length;i++,j++) {
			ar[i]=marged[j];
		}
		return;
	}

}
