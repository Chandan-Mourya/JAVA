package com.question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PlayList p=new PlayList();
		System.out.println("Enter number of songs");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter Movie Name");
			String movie=sc.next();
			System.out.println("Enter Song Name");
			String song=sc.next();
			p.addSong(new Song(movie,song));
		}
//		for(Song s:songs) {
//			
//		}
		
		
		
		
		//System.out.println();
		//System.out.println(a.play());

	}

}
