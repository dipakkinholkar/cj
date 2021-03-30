import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Connection_With_Oracle_Database {

		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
	
	
	public static void main(String[] args) {
		
	/*	try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select *from login");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			
			if(con!=null)
			{
				rs.close();
				stmt.close();
				con.close();
			}
				else
				{
					System.out.print(" not connected");
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
			
		}*/	
		System.out.println("1 : Insert Record !");
		System.out.println("2 : Retrieve Record !");
		System.out.println("3 : Delete Record");
		System.out.println("Enter your choise :");
		Scanner s=new Scanner(System.in);
		int choise=s.nextInt();
	
		switch(choise)
		{
		case 1:
		{	
			try{
				Scanner ins=new Scanner(System.in);
				String user=ins.nextLine();
				String pass=ins.nextLine();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
				String query="select *from login";
			       PreparedStatement pmt=con.prepareStatement(query);
			     pmt.setString(1,user);
			     pmt.setString(2,pass);
				if(con!=null)
					
				{
					
				
					con.close();
				}
					else
					{
						System.out.print(" not connected");
					}
				}
			catch(Exception e)
			{
				System.out.println(e);
				
			}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}break;
	
		}
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
