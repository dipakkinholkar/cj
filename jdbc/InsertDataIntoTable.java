
package database.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertDataIntoTable {

public static void main(String args[])
{
 try{
               
                Class.forName("oracle.jdbc.driver.OracleDriver");
                
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
 
                    
               PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?)");
               
               ps.setInt(1,122);
               ps.setString(2,"supriya");
               ps.setString(3,"pune");
               
               int i=ps.executeUpdate();
               
               if(i==1)
                       {
                           System.out.println(i);
                       }
                
 
    }catch(Exception e)
    {
    System.out.println(e);
    }
 
 
 
 
 







}


    
}
