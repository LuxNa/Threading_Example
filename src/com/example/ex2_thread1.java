package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ex2_thread1 extends Thread {
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		try {
			URL oracle = new URL("https://mail.live.com/");
			BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

			String inputLine;
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("live.html"))) {
				while ((inputLine = in.readLine()) != null) {
					bw.write(inputLine);
				}
				System.out.println("Done");
			} catch (IOException e) {
				e.printStackTrace();
			}
			// System.out.println(inputLine);
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Thread 1 "+(end - start) + " ms");
	}
	
	
}
