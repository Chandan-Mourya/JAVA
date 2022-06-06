package com.question3;

import java.util.Scanner;

public enum Month {
	JAN,FEB,MAR,APR,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC;
}

class Demo{
	void showDetails(Month m) {
		switch(m) {
		case JAN:
			System.out.println("“This is the 1st Month of the Year January”");
			break;
		case FEB:
			System.out.println("“This is the 2st Month of the Year February”");
			break;
		case MAR:
			System.out.println("“This is the 3st Month of the Year March”");
			break;
		case APR:
			System.out.println("“This is the 4st Month of the Year April”");
			break;
		case MAY:
			System.out.println("“This is the 5st Month of the Year May”");
			break;
		case JUNE:
			System.out.println("“This is the 6st Month of the Year June”");
			break;
		case JULY:
			System.out.println("“This is the 7st Month of the Year July”");
			break;
		case AUG:
			System.out.println("“This is the 8st Month of the Year August”");
			break;
		case SEP:
			System.out.println("“This is the 9st Month of the Year September”");
			break;
		case OCT:
			System.out.println("“This is the 10st Month of the Year October”");
			break;
		case NOV:
			System.out.println("“This is the 11st Month of the Year November”");
			break;
		case DEC:
			System.out.println("“This is the 12st Month of the Year December”");
			break;
			
		default:
			System.out.println("Invalid Month Name");
		}
		
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the month name:");
			String month=sc.next();
			
			Month m=Month.valueOf(month.toUpperCase());
			d.showDetails(m);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Month Name");
		}
		
	}
}
