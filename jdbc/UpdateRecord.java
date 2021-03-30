
package javadatabase.Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class UpdateRecord {
    
    
    public static void main(String args[])
    {
    try{
        String query="update emp set ename='dyanu' where eid=105 ";
        
          Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
        
        Statement stmt=con.createStatement();
        
        stmt.executeUpdate(query);
        
        }
    catch(Exception e)
    {
    System.out.println(e);
    
    }
    }
    
}
