
package javadatabase.Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateRecordById {
    
    
    public static void main(String args[])
    {
      
        
        try{
            
              Scanner scn=new Scanner(System.in);
        System.out.print("Enter Which Record You want to Update !");
        int record=scn.nextInt();
        System.out.print("Enter Emp Name :");
        String name=scn.next();
        System.out.print("Enter Emp Role :");
        String role=scn.next();
        
        String query="update emp set ename='"+name+"' ,erole='"+role+"' where eid='"+record+"' ";
          Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
        
        if(con!=null)
        {
        Statement stmt=con.createStatement();
        int i=stmt.executeUpdate(query);
        if(i==0)
        {
        System.out.println("Not Record Found");
        }
        else
        {
        System.out.println("Record Updated :"+i);
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
