package Array;

public class addetionOfArray {
	
	public static int [] sumOfArray(int ar []) {
		int length=-1;
		for(int i=0;i<ar.length;i++){
		if(i*(i+1)/2>=ar.length){
		length=i;
		break;
		}
		}
		int sum[]=new int[length];
		int k=0;
		for(int i=0;i<sum.length;i++) {
			
		for(int j=0;j<=i;j++) {
			if(k==ar.length) 
				break;
			sum[i]+=ar[k++];
		}
		}
		
		return sum;
	}

	public static void main(String[] args) {
    int ar[]=new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

 
	int ar1[]=sumOfArray(ar);
	for(int i=0;i<ar1.length;i++) {
		System.out.println(ar1[i]);
	}
	}
}