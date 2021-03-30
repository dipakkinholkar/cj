
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionTest {

public static void main(String args[])
{

try{

    Class.forName("oracle.jdbc.driver.OracleDriver");
    
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","dipak");

if(con!=null)
{
System.out.println("Connection Successfull");
}
else
{
System.out.println("Connection Failed");
}


}catch(Exception e)
    
    
{
System.err.println(e);
}


}






}
