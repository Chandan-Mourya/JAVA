package com.question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("E://FSWD/java/java Assignments//SB2//src//com//question1/abc.txt");
		
		
		long l=f.length();
		
		char[] chr=new char[(int)l];	//downcast kiya
		 
		try {
			FileReader	fr = new FileReader(f);
			try {
				fr.read(chr);
			
				for(char c:chr) {
					
					System.out.print(c);	//Remove ln from println
					}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}



















