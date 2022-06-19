package com.question1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Student {
	private int Roll;
	private String Name;
	private int Marks;
	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	Student(){
		
	}
	public Student(int roll, String name, int marks) {
		super();
		Roll = roll;
		Name = name;
		Marks = marks;
	}
	
	
	
}

class Main{
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
 
		HashMap<String,Student> hm = new HashMap<>();
		hm.put("Maharashtra", new Student(101,"Chandan",450));
		hm.put("Rajsthan", new Student(105,"Shubham",990));
		hm.put("Maharashtra", new Student(104,"Mausam",40));
		hm.put("Rajsthan", new Student(109,"Vijay",90));
		hm.put("Maharashtra", new Student(102,"Sagar",50));
		hm.put("Rajsthan", new Student(100,"Hritik",910));
        Map<String, Student+
        > hm1 = sortByValue(hm);
 
        // print the sorted hashmap
        for (Map.Entry<String, Student> en : hm.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue().toString());
        }
    }
    
//	public static void main(String[] args) {
//		HashMap<String,Student> hm = new HashMap<>();
//		hm.put("Maharashtra", new Student(101,"Chandan",450));
//		hm.put("Rajsthan", new Student(105,"Shubham",990));
//		hm.put("Maharashtra", new Student(104,"Mausam",40));
//		hm.put("Rajsthan", new Student(109,"Vijay",90));
//		hm.put("Maharashtra", new Student(102,"Sagar",50));
//		hm.put("Rajsthan", new Student(100,"Hritik",910));
//		
//		List<Map.Entry<String, Integer> > list =
//	               new LinkedList<Map.Entry<String, S> >(hm.entrySet());
//		
//		 for (Map.Entry<String, Student> en : hm.entrySet()) {
//	            System.out.println("Key = " + en.getKey() +
//	                          ", Value = " + en.getValue());
//	        }
//	}
}


















