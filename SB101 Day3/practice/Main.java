package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Chandan ch =new Chandan(101,"chandan");
		Chandan ch1=new Chandan(102,"Shubhan");
		Chandan ch2 = new Chandan(103, "Mausam");
		
		
		List<Chandan> list = new ArrayList<>();	
		list.add(ch);
		list.add(ch2);
		list.add(ch1);
		try {
			FileOutputStream fis=new FileOutputStream("E:\\FSWD\\file1.txt");
			try {
				ObjectOutputStream ois=new ObjectOutputStream(fis);
				ois.writeObject(list);
				ois.close();
				fis.close();
				System.out.println("Serialization Completed and save in file1.txt");
				
				
				
				
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
