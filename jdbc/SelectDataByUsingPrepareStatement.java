
package database.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class SelectDataByUsingPrepareStatement {

    
    static{
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
            
            PreparedStatement ps=con.prepareStatement("select * from emp");
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
            System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
            }
          }
        catch(Exception e)
        {
        System.out.println(e);
         }
        
        
           

        }
    
    






    
}
