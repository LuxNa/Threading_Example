package com.example;

public class ThreadOne extends Thread {
	@Override//annotaion used to override run method of Thread class
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Thread 1");
		}
	}
}
