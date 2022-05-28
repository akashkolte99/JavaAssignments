package com.ass2;

public class Main {

	public static void main(String[] args) {

		int[][] matrix = {
				{1, 2, 3},
				{4 ,5 ,6},
				{7 ,8, 9}
		};
		
		int N = 3;
		int M=3;
		
		for(int i=0;i<N;i++) {
			int sum = 0;
			for(int j=0;j<M;j++) {
				if(matrix[j][i]%2==0) {
					sum+=matrix[j][i];
				}
				
			}
				System.out.println(sum);
			
		}
	}
}
