package com.example;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import app.musicplayer.MusicPlayer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ex2_thread3 extends Thread {

	@Override
	public void run() {
		
		/*String song = "http://www.ntonyx.com/mp3files/Morning_Flower.mp3";
		// String song = "https://gaana.com/song/swag-se-swagat";
		// String song =
		// "http://media.djmazadownload.xyz/music/Singles/BomDiggyDiggy-DJMaza.Fun-190Kbps.mp3";
		// String song = "C:\\Users\\SELVAN\\Music\\Jab Koi Baat - Atif Aslam & DJ
		// Chetas -320Kbps [DJMaza.Fun].mp3";
		Player mp3player = null;
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new URL(song).openStream());
			mp3player = new Player(in);
			mp3player.play();
			System.out.println("player started");
		} catch (MalformedURLException ex) {
		} catch (IOException e) {
		} catch (JavaLayerException e) {
		} catch (NullPointerException ex) {
		}*/
		//		
		
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MusicPlayer.launchMP();
		
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			wait();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		MusicPlayer.isPlaying();
		
			}
}
