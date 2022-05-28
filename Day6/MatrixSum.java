package com.Day6;

public class MatrixSum extends ReverseString {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int row=arr.length;
		int col=arr[0].length;
		for(int j = 0; j < col; j++) {
			int sum=0;
			for (int i = 0; i < row; i++) {
				if(arr[i][j]%2==0) {
					sum+=arr[i][j];
			}
		}
		System.out.println(sum);
		}
	}
}
