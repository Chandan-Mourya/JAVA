package com.Day6;

public class Factorial {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int fact=1;
		int diff=0;
		//case 1
		for(int i=1;i<=num1;i++) {
			fact=fact*i;
		}
		System.out.println("Your factorial is "+fact);
		
		//case 2
		diff=num2-num3;
		System.out.println("Your diff is "+Math.abs(diff));
		
		//case 3
		if(args.length>3) {
			System.out.println("Error");
		}
		
	}
}
`