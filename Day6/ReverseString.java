package com.Day6;

import java.util.Scanner;

public class ReverseString {
	
	public static void reverseStr(String input) {
		String bag="";
		int[] arr=new int[input.length()];
		for(int i=input.length()-1; i>=0; i--) {
			//System.out.println(input.charAt(i));
			bag+=input.charAt(i);
			//arr.push(input.charAt(i));
		}System.out.println("Modified String is:"+bag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString=sc.next();
		System.out.println("Original String is: "+originalString);
		reverseStr(originalString);
		
		
		//System.out.println("Reverse String is: ");
		
	}

}
