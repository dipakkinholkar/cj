package com.dipak.send;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.SplittableRandom;

public class sendOTP {

	public static void main(String[] args) {
	
		String otp=sendOTP.generateOTP(5);
		
		sendOTP.sendSMS(otp);
		
		System.out.print(otp+"\n");
		
		
	}
	
	public static void sendSMS(String otp)
	{	
			try {
				
				String apiKey="apiKey=" + "fPhAYw1mXH0-zS8dwWkV3zxQJ1LWvWLX4qftzcYRBk";
				
				String message="&message=" + URLEncoder.encode("This is a test message your one time password for activating your Textlocal account is " + otp , "UTF-8");
				
				String numbers="&numbers=" + "7057807659";
				
				String apiURL="https://api.textlocal.in/send/?" + apiKey + message + numbers;
				
				URL url=new URL(apiURL);
				
				URLConnection con=url.openConnection();
				
				con.setDoOutput(true);
				
				
				BufferedReader reader=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
				String line="";
				
				StringBuilder sb=new StringBuilder();
				
				while((line= reader.readLine() ) !=null)
				{
					sb.append(line).append("\n");
				
				}
				
				System.out.print(sb.toString());
				
			}
	
				catch(Exception e)
			
			{
				e.printStackTrace();
			}
		
	}
	
	
	
	public static String generateOTP(int otplength)
	{
		SplittableRandom sr=new SplittableRandom();
		StringBuilder sb =new StringBuilder();
	
		
		for(int i=0; i<otplength; i++)
		{
			sb.append(sr.nextInt(0, 9));
		}
		
		return sb.toString();
		
	}
	

}
