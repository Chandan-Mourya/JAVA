package com.question2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Address a=new Address("Maharashtra", "Boisar", "402502");
		Student s=new Student(101,"chandan", a,"chandan@gmail.come","Pass@1234");
		
		try {
			FileOutputStream fos = new FileOutputStream("E:\\FSWD\\file1.txt");
			try {
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(s);
				oos.close();
				System.out.println("List is Serialized");
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
