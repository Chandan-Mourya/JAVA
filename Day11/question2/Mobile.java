package com.question2;

import java.util.Scanner;

public class Mobile {

	String[] o = {"note4","note5","note6","note7"};
	
	String  searchOutDatedModel(String componyName, String ModelName) {
		boolean flag=false;
		for(String i: o) {
			if(i.equals(ModelName)) {
				System.out.println(i+"_OUTDATED");
				return i;
			}
			if(i!=ModelName) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Latest Model");
		}
	
		return null;
	
		
		
	}
	
//	void searchOutDatedModel(String componyName) {
//		for(int i=0; i<o.length; i++) {
//			if(o[i]=="ModelName") {
//				return ModelName+" ";
//			}
//		}
//	
//		String r=ModelName+"_OutDated";
//		return r;
//	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Model name");
		String md=sc.next();
		
		System.out.println("Enter Compony Name");
		String cp=sc.next();
		m.searchOutDatedModel(cp,md);
		//m.searchOutDatedModel("Samsung","note4");
		//System.out.println(s);
	}
}

