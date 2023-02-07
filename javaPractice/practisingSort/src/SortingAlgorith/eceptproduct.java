package SortingAlgorith;

public class eceptproduct {
	public static long[] productExceptSelf(int[] nums) {
        
        long output[] = new long[ nums.length];
        
        output[0] = 1;

        // left prefix product
        for(int i=1;i<nums.length;i++){
             output[i] = output[i-1] * nums[i-1];
        }
        
        long product = 1;

        for(int i=nums.length-1;i>=0;i--){
            
            output[i] = output[i] * product;
            
            product*= nums[i];
        }
        
        return output;
}
    
    public static void main(String[]arg) {
    	int ar[]=new int[] {1,2,3,4,23,4,5,6,78,8,6,5,4,3,4,6,7,88,9,6,44,3,22,3,4,5,67,8,9,21,22,12,12,23};
    	long ans[]=new long[ar.length];
    	System.out.println(ar.length);
    	
    	ans=productExceptSelf(ar);
    	for(long n:ans) {
    		System.out.print(n+" ");
    	}
    	

    	}
}
