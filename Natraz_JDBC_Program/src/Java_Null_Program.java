		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.Statement;
		
		
		public class Java_Null_Program {
		
			
			public static void main(String[] args)throws Exception {
				
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select *from student where id is not null");
				while(rs.next()!=false)
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));	
				}
				
				rs.close();
				stmt.close();
				con.close();
				
			}		
	}


