package com.tnsif.multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		ThreadDemo d1=new ThreadDemo();
		d1.setPriority(1);
		d1.start();
		ThreadDemo d2=new ThreadDemo();
		d2.setPriority(8);
		d2.start();
	}

}
