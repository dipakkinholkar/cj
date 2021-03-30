import java.sql.*;
public class DB
{
public static void main(String args[]) throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");

if(con==null)
System.out.println("Connection of oracle database failed");
else
System.out.println("Connection of oracle database successfull!");
}
}