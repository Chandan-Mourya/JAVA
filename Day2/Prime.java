package com.chandan;



import java.util.Scanner;

public class PrimeFactors {
		public static void prime(int n) {
			for(int i=1; i<=n; i++) {
				if(n%i ==0) {
					System.out.println(i);
				}
			}
		}
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number");
				int n=sc.nextInt();
				prime(n);
			}
		}
		
