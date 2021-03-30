import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class CheckWiFi
{
	public static void main(String args[])
	{
	 Socket obj=new Socket();
        InetSocketAddress addr=new InetSocketAddress("www.dipak.com",100);
        try{
            
            obj.connect(addr,3000);
            System.out.println("Username : dipak Kadam");
            System.out.println("WiFi is Connected");
            
                    
        }
        catch(Exception e)
        {
            System.out.println("WiFi  is not Connected");
        }
        try{
        obj.close();        
        }
        catch(Exception e)
        {
        	
        }


	}


}