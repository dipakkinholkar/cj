
package database.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteData {

public static void main(String args[])
{
        String query="delete from emp where eid=111";
            try{   
            
                Class.forName("oracle.jdbc.driver.OracleDriver");
                
                
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
            
               PreparedStatement ps=con.prepareStatement(query);
                
               ResultSet rs=ps.executeQuery();
               
            }
            
            catch(Exception e)
            {
            
            System.out.println(e);
            }


}
    
}
