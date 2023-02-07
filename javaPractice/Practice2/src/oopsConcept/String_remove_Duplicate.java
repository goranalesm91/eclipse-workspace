package oopsConcept;

import java.util.HashSet;

public class String_remove_Duplicate {

	public static void main(String[] args) {
 String s="Siddharam";
 String ans="";
   HashSet<Character> set=new HashSet();
   
   for(int i=0;i<s.length();i++){
	   set.add(s.charAt(i));
   }
   
   
   
   for(int i=0;i<s.length();i++) {
	   char ch=s.charAt(i);
	   if(set.contains(ch)) {
		   ans+=ch;
		   set.remove(ch);
	   }
   }
   System.out.print(ans);
	}

}
