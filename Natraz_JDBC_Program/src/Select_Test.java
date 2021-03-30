import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Select_Test {
	
	
	void sendvalue(String user,String pass)
	{
		System.out.println(user+" "+pass);
		
	}
	public static void main(String[] args)throws Exception {
		
		Select_Test obj=new Select_Test();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select *from login where USERNAME='dipak' and PASSWORD='kadam'");
		while(rs.next()!=false)
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			String user=rs.getString(1);
			String pass=rs.getString(2);
			obj.sendvalue(user,pass);
		}
		
		rs.close();
		stmt.close();
		con.close();
		
	}

}
