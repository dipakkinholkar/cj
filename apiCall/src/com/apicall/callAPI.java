package com.apicall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.omg.CORBA.portable.InputStream;

public class callAPI {

	public static void main(String[] args) throws IOException {
		
		try {
		URL url=new URL("http://jsonplaceholder.typicode.com/users");
		
		HttpURLConnection con=(HttpURLConnection) url.openConnection();
		
		System.out.print(con.getResponseCode());
		
		
		
		if(con.getResponseCode()==200)
		{
	java.io.InputStream im=con.getInputStream();
		StringBuffer sb=new StringBuffer();
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(im));
		
		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		}
		
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		

	}

}
