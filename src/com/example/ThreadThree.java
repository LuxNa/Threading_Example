package com.example;

public class ThreadThree extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Thread 3");
		}
	}
}
