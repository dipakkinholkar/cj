package com.basic.array;

public class AnonymousArray {

	
	public static void Anonymous(int arr[])
	{

		System.out.print("integer");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	public static void Anonymous(double arr[])
	{
		
		System.out.print("double");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		AnonymousArray.Anonymous(new int[]{10,20,20,30,30});
		AnonymousArray.Anonymous(new double[]{10,20,20,30,30});
		
		
		
	}

}
