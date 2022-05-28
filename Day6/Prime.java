package com.Day6;

public class Prime {
	public static int[] findPrime(int[] arr1,boolean isPrime) {
		for (int j = 0; j < arr1.length; j++) {
			if(arr1[j]%2!=0 && arr1[j]%3!=0) {
	            isPrime=true;
	            System.out.println("Prime is "+arr1[j]);
	        }
	    }
		if(!isPrime) {
			System.out.println("Prime number not found in the supplied Array");
		}
		return arr1;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,12,5,17,151,59,50,14,15,13,47};
		int sum=0;
	    boolean isPrime = false;
	    findPrime(arr,isPrime);
	}
}
