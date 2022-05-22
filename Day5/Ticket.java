package com.Day5;

import java.util.Scanner;

public class Ticket {

	private int ticketid;
	private int price;
	static int ava_Tickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAva_Tickets() {
		return ava_Tickets;
	}
	public static void setAva_Tickets(int ava_Tickets) {
		Ticket.ava_Tickets = ava_Tickets;
		if(Ticket.ava_Tickets < 0) {
//			System.out.println(" Zero and negative values are not allowed");
			
		}
	}
		
	public int calculateTicketCost(int nooftickets) {
			int a=getAva_Tickets();
			if(a>0) {
				a=a-nooftickets;
				if(a<0) {
					System.out.println("Not Tickets");
				}else {
					setAva_Tickets(a);
				}
				int t_amt=nooftickets*getPrice();
				return t_amt;
			}else {
				return -1;
			}
		
		}
	
	public static void main(String[] args) {
		Ticket t=new Ticket();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
			int b=sc.nextInt();
			System.out.println("Enter the available tickets:");
			int tic=sc.nextInt();
			
			System.out.println("Enter Price:");
			int pri=sc.nextInt();
			
			t.setAva_Tickets(tic);
			t.setPrice(pri);
			
			for(int i=0; i<b; i++) {
				System.out.println("No. of tickets");
				int num=sc.nextInt();
				System.out.println(" Enter the ticketid");
				int id=sc.nextInt();
				int pp=t.calculateTicketCost(num);
				if(t.getAva_Tickets()<0) {
					System.out.println("No");
				}else {
					System.out.println("Total Price "+pp);
					System.out.println("Available Tickets "+ t.getAva_Tickets());
				}
				
			}
			
	}
	
}
