
package javadatabase.Basic;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class CreateTable {

public static void main(String args[])
{
        try{
        Scanner scn=new Scanner(System.in);
       System.out.print("Enter your Query :");
       String query=scn.nextLine();
            
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
            
            if(con!=null)
            {
            
                Statement stmt=con.createStatement();
                
           ResultSet rs=stmt.executeQuery(query);
            if(stmt!=null)
            {
            System.out.println("Table Created");
            }
            else
            {
            System.out.println("Table not Created");
            }
            }
        
        }
        catch(Exception e)
        {
        
        System.out.println(e);
        
        }



}

    
}
