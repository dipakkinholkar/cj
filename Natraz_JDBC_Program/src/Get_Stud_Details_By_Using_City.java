import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;

public class Get_Stud_Details_By_Using_City {

	public static void main(String[] args) {
		
		try{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter city :");
		String city=scn.next();
	
		city="'"+city+"'";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
		Statement stmt=con.createStatement();
		
	ResultSet rs=stmt.executeQuery("select *from student where city="+city);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
			
	}

}
