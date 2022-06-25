package com.question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadClass{

	public static void main(String[] args) {
		
		try {
			FileReader	fr = new FileReader("E://FSWD/java/java Assignments//SB2//src//com//question1/abc.txt");
			
			BufferedReader br=new BufferedReader(fr);
			
			try {
				String line=br.readLine();
				
				while(line != null) {
					System.out.println(line);
					line=br.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
