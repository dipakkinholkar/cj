		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.Statement;
		
		
		public class Select_Test2 {
		
			
			public static void main(String[] args)throws Exception {
				
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select *from login");
				while(rs.next()!=false)
				{
					System.out.println(rs.getString(1)+" "+rs.getString(2));
					String user=rs.getString(1);
					String pass=rs.getString(2);
					}
				
				rs.close();
				stmt.close();
				con.close();
				
			}		
	}


