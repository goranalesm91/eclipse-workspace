package com.thread;

public class MyThread implements Runnable {
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("thred method run");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread th=new MyThread();
        Thread t1=new Thread(th);
        t1.start();
        for(int i=0;i<5;i++) {
        	System.out.println("main method run");
        }
	}

}
