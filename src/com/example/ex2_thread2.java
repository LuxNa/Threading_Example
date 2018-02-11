package com.example;

public class ex2_thread2 extends Thread {
	@Override
	public void run() {
	//copy paste
		long start = System.currentTimeMillis();
		TextTransfer.clipboard();
		long end = System.currentTimeMillis();
		System.out.println("Thread 2 "+(end - start) + " ms");
	}
	
}
