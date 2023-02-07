package thread;

import java.util.HashMap;

public class addTwo {
	
	public static int [] sumTarget(int[] ar,int tar) {
		int ans[]=new int[2];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			int ele=ar[i];  //{8, 7, 2, 5, 3, 1};
			if(map.containsKey(tar-ele)){
				ans[1]=ar[i];
				ans[0]=ar[map.get(tar-ele)];
				return ans;
			} else {
				map.put(ele, i);
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
	int []	nums = new int[] {8, 7, 2, 5, 3, 1};
			int 	target = 10;
				 
   int ans[]=sumTarget(nums,target);
   for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
	
	}

}
