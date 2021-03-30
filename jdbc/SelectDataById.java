
package javadatabase.Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;

public class SelectDataById {
 
    
    
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
    
        
        
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","dipak");
        
        Statement stmt=con.createStatement();
        Scanner scn=new Scanner(System.in);

    System.out.println("Enter Employee Id :");
    String eid=scn.next();
    String query="select *from emp where eid='"+eid+"'";
    
   ResultSet rs=stmt.executeQuery(query);

   while(rs.next())    
   {
   System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
   }
   
 
    }
    
    
}
