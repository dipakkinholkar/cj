package com.basic.array;

public class AddofTwoArray {

	public static void main(String[] args) {
	
		
		int[][] a= {
					{1,2,3},
					{4,5,6},
					{7,8,9}
				 };

		int[][] b= {
					{1,2,3},
					{4,5,6},
					{7,8,9}
				 };
		 int c[][]= {
				 {0,0,0},{0,0,0},{0,0,0}
		 			};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				
				 c[i][j]=a[i][j] + b[i][j];
				

					System.out.print(" "+c[i][j]);
			}
			System.out.println(" ");
			
			
			
		}
		
		
		
	}

}
