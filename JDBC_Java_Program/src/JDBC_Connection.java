
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC_Connection {
	
	Connection con=null;
	Statement stmt=null;
	
	
	
	public static void main(String[] args) {
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");

Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select *from login");

while(rs.next())
{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2));
}

if(con!=null)
{
	System.out.println("connected");
}
	else
{
	System.out.println("not connected");			
}			
		}catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		
		

	}

}
