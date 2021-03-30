
package javadatabase.Basic;
import java.util.Scanner;
import static java.lang.Class.forName;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class SelectDataByName {

public static void main(String args[]) 
{
        Scanner scn=new Scanner(System.in);
        String ename=scn.next();
        Connection con=null;
        String query="select *from emp where ename='"+ename+"'";
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "dipak");
        
        if(con!=null)
        {
        Statement stmt=con.createStatement();
        
        ResultSet rs=stmt.executeQuery(query);
         int i=0;
        while(rs.next())
        {
        System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
        i++;
        }
         if(i==0)
        {
        System.out.println("Record Not Found !");
        }
        }
        
        else
        {
        System.out.println("Connection not Established !");
        }
    }
catch(Exception e)
{
    System.out.println(e);
}    
    
}

    
}
