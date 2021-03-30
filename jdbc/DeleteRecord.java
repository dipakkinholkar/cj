package javadatabase.Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
    
    public static void main(String args[])
    {
    try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
           
           if(con!=null)
           {
               Statement stmt=con.createStatement();
               
          int i= stmt.executeUpdate("delete from emp where eid=102");
               if(i!=0)
               {
               System.out.println("Record Deleted :"+i);
               }
               else
               {
               System.out.println("Record Not Found");
               }
           }
           else
           {
           System.out.println("Connection Not Established !");
           }
        
    
        }
    
    catch(Exception e)
    {
    
    System.out.println(e);
    
    
    }
    
    
    
    
    
    }
    
}
