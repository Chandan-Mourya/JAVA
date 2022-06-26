package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("E:\\FSWD\\file1.txt");
			try {
				ObjectInputStream ois=new ObjectInputStream(fis);
				try {
				List<Chandan> l1=(List<Chandan>)ois.readObject();
					l1.forEach(a->{
						a.toString();
					});
					ois.close();
					fis.close();
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
