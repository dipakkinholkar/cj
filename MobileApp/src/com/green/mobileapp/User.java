package com.green.mobileapp;

import java.util.Scanner;

public class User {

	public static void main(String args[]) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Your Sim Name :");
		String usim=scn.next();
		
		Sim sm=null;
		
		
		
		if(usim.equalsIgnoreCase("Airtel"))
		{
			sm=new Airtel();
		}
		else if(usim.equalsIgnoreCase("Gio"))
		{
			sm=new Gio();
		}
		else if(usim.equalsIgnoreCase("Idea"))
		{
			sm = new Idea();
		}
		else if(usim.equalsIgnoreCase("Bsnl"))
		{
			 sm=new Bsnl();
		}
		else 
		{
			System.out.println("No Service Available !");

			if(sm==null)
				System.exit(0);
		}
		
		Mobile m=new Mobile();
		
		m.UserSim(sm);
		
		

	}
	
	
	
	
}
