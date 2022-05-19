package com.day3;

public class Vowel {
	String num;
	
	void Vowel() {
		if(num=="a" || num=="e" ||num=="i" ||num=="o" ||num=="u" ||num=="A" ||num=="E" ||num=="I" ||num=="O" ||num=="U") {
			System.out.println("character is vowel ");
		}else if(num=="!" || num=="@" || num=="#" || num=="$" || num=="%"|| num=="&" || num=="*") {
				System.out.println("Invalid Character");
		}
		else {
			System.out.println("character is consonant ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vowel v1=new Vowel();
		v1.num="a";
		v1.Vowel();
		
		Vowel v2=new Vowel();
		v2.num="B";
		v2.Vowel();
		
		Vowel v3=new Vowel();
		v3.num="#";
		v3.Vowel();
	}

}
