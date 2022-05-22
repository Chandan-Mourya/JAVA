package Day4;

import java.lang.Math;

public class Wholenum {
		int num;
		void printnum() {
			if(num%2!=0) {
				System.out.println("num");
			}else if(num%2==0) {
				//Double res=Math.ceil(num / 10) * 10;
				System.out.println(Math.ceil(num / 10) * 10);
				//System.out.println(res);
			}
			else {
				System.out.println("Error");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wholenum w=new Wholenum();
				w.num=44;
				w.printnum();
		
	}

}
