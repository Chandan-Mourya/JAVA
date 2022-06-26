package com.question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p=Paths.get("E:\\FSWD\\java\\java Assignments\\SB101 Day3\\src\\com\\question1\\a1.txt");
		
		
		try {
			List<String> 	list = Files.readAllLines(p);
			System.out.println("Reading from the file");
			for(String line:list) {
			System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
