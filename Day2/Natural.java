package com.chandan;

public class Natural {
	public static void positive(int n) {
		int num=n+1;
		num=num*n;
		int div=num/2;
		System.out.println(n+" natural numbers will be: "+div);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can also call the static method without creating the 
		//object thats why i havent createdd theo bject
		positive(5);

	}

}
