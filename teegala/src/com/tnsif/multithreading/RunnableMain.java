package com.tnsif.multithreading;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableDemo r=new RunnableDemo();
		Thread tt=new Thread(r);
		tt.start();

	}

}
