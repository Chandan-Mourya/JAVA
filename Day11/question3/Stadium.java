package com.question3;

import java.util.Scanner;

public enum Stadium {
	
	
	EDEN_GARDENS_STADIUM,

	WANKHEDE_STADIUM,
	CHIDAMBARAM_STADIUM,
	M_CHINNASWAMY_STADIUM;
	
}

class IPL{
	void homeTeamStadium(Stadium stadium){
		//System.out.println(stadium);
		switch (stadium){
		case EDEN_GARDENS_STADIUM:
			System.out.println("“This is the home ground of KKR”");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("“This is the home ground of Mumbai Indians”");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("“This is the home ground of CSK”");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("“This is the home ground of RCB”");
			break;
		default:
			System.err.println("Enter Correct Ground name");
		}
		
	}
	public static void main(String[] args) {
		IPL i=new IPL();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stadium name:");
		String str=sc.next();
		
		
		Stadium s=Stadium.valueOf(str.toUpperCase());
		i.homeTeamStadium(s);
	}
}
