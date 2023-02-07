package recursion;

public class printIncreasAndDec {
  public static void printincDnc(int x,int tar) {
  if(x==tar) {
	  System.out.println(x);

	  return;
  }
  System.out.println(x);
  printincDnc(x+1,tar);
  System.out.println(x);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printincDnc(1,10);
	}

}
