import java.util.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
public class ConnTest{

public static void main(String agrs[])
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select *from login");
while(rs.next())
{
System.out.println(rs.getString(1)+""+rs.getString(2));
}
}
} 