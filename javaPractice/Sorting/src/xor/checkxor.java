package xor;

import java.util.Scanner;

public class checkxor {
 public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt() ;
 int ar1[]=new int[n];  //0,2,4,1
for(int i=0;i<n;i++) {
	ar1[i]=sc.nextInt();
}
int miss=0;
for(int i=1;i<ar1.length;){
   miss=miss-ar1[i]-i;
  }
System.out.print(miss);

}
}
