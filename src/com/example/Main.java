package com.example;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		/*
		 * ThreadOne t1 = new ThreadOne(); ThreadTwo t2 = new ThreadTwo(); ThreadThree
		 * t3 = new ThreadThree(); t1.start(); /*with start method --2500000 ns approx
		 * wheras with run mtd it is 3900000 but both is thread class mtd! when u use
		 * run instead of start...run method gets executed as normal method.... but when
		 * u call start method.... it creates child thread and then executes
		 * corresponding run method this way ...if we are using start method then there
		 * will be 4 different threads.... main....thread 1....thread 2...thread 3... if
		 * we use run directly then only one thread... main thread...
		 */

		// t2.start();
		// t3.start();

		/**
		 * example 2- download of file...task 1 copy paste task 2 playing music task 3
		 */

		ex2_thread1 t1 = new ex2_thread1();
		ex2_thread2 t2 = new ex2_thread2();//ye thread  2 ab
		ex2_thread3 t3 = new ex2_thread3();//ye thread  2 ab
		t1.start(); 
		t2.start();
		t3.start();
		t3.sleep(300);
		
		long end = System.currentTimeMillis();
		System.out.println("total "+(end - start) + " ms");

	}
}
