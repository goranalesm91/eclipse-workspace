package com.ecxeption;

public class tryCatch {

	public static void main(String[] args) throws Exception {
String s=null;
try {
    	System.out.println(s.length());
    }catch (ArithmeticException | NullPointerException e) {
//		System.out.println(num/2);
		System.out.println(e);
	}
    finally {
    	System.out.println("finally block");
//    	num=0;
    }
//    System.out.println(num);
	}

}
