package com.bankapp;
import java.util.HashSet;
public class AccountValidation {
	
	private HashSet<String> uname=new HashSet<String>();
	private HashSet<String> upass=new HashSet<String>();
	
	
	public final  boolean Validation(String accNo, String pass)
	{
		uname.add("dipak");
		upass.add("kadam");
		uname.add("dipak");
		
		
		
	
		
		if( upass.equals(pass))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
		
	}
	
	
	
	
	
	
	

}
