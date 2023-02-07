package oopsConcept;
import java.util.*;

public class removeOvel {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(removeovel(s));


	}
	public static String removeovel(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I'|| ch=='O'|| ch=='U' ||
					ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
			continue;
				
			}else {
			ans=ans+ch;
			}
		}
		return ans;
	}

}
