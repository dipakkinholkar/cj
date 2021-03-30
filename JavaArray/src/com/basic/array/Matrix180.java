package com.basic.array;

public class Matrix180 {

	public static void main(String[] args) {
		
		int  arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		
			for(int j=0; j<arr.length; j++)
			{
					
					for(int k=0; k<j+1; k++)
					{
						System.out.print(arr[j][k]+" ");
					}
					System.out.println("");
				
			}
		
		
		
		
		
		
		
	}

}
