package javaProject;

public class subSequence {
	public static void printSubSecunce(String s,int a,String em) {
		if(a==s.length()) {
			System.out.println(em);
			return;
			
		}
		char ch=s.charAt(a);
		
		printSubSecunce(s,a+1,em);
		printSubSecunce(s,a+1,em+ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="abc";
		printSubSecunce(s,0,"");
		
	}

}
