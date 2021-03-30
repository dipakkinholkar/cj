
package javadatabase.Basic;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class DropTable {

public static void main(String args[])
{
    try{
        String query="drop table droptable";
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        // Load the Class
    Class.forName("oracle.jdbc.driver.OracleDriver");
        // Establish The Connection
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","dipak");
        
    if(con!=null)
    {
    st=con.createStatement();
    rs=st.executeQuery(query);
    
    if(rs!=null)
    {
    System.out.println("Table Droped !");
    rs.close();
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
