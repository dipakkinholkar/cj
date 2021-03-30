import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Get_Emp_Details {

	public static void main(String[] args) {
		 Scanner scn=null;
		 Connection con=null;
		 Statement st=null;
		 ResultSet rs=null;
		 String desg1=null;
		// String desg2=null;
		// String desg3=null;
		 boolean flag=false;
		 
		 try{
			 scn=new Scanner(System.in);
			 if(scn!=null)
			 {
				 System.out.println("Enter desg1 :");
				
				 desg1=scn.next();
				 
				 //desg1=scn.next().toUpperCase();  // gives CLERK
				// System.out.println("Enter desg2 :"); 
				// desg2=scn.next().toUpperCase();  // gives MANAGER
				// System.out.println("Enter desg3 :"); 
				// desg3=scn.next().toUpperCase();  // gives SALEMAN	 
			 
		 
			 //FRAME condition ('CLERK','MANAGER','SALESMAN')
			 
			 //String cond="('"+desg1+"','"+desg2+"','"+desg3+"')";
			 String cond="('"+desg1+"')";
			 
			 //gives ('CLERK','MANAGER','SALEMAN')
			 //register jdbc driver software.
			 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 // Establish the Connection.
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");
			// create statement object.
			 if(con!=null)
			 st=con.createStatement();
			 // create ResultSet object.
			 //frame the sql Query.
			 //select empno,ename,job,sal from  emp where job in ('clerk','manager','salesman') order by job.
			 
			 String query="select empno,ename,job,sal from emp where job in "+cond+" order by job";
			 System.out.println("");
			 System.out.print(query);
		 // send and execute SQL Query in database software
			 if(st!=null)
				 rs=st.executeQuery(query);
			 // process the ResultSet.
			 if(rs!=null)
				 while(rs.next())
				 {
					 flag=true;
					 System.out.println("");					 
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));			 
					 
				 }// end while.
			 if(flag==false)
			 System.out.print("No records Found");
		 }// end if
		 }// end try.
		 catch(SQLException se) // known Exception 
		 {
			 se.printStackTrace();
			 
		 }
		 catch(ClassNotFoundException cnf)//known Exception
		 {
			 cnf.printStackTrace();
			 
		 }
		 catch(Exception e)// unknown Exception
		 {
			 e.printStackTrace();

		 }
		 finally{
			 
			 // close objects.
			 try{
				 if(rs!=null)
					 rs.close();
			 }
			 catch(SQLException se)
			 {
				 se.printStackTrace();
			 }
			 try{
				 if(st!=null)
					 st.close();
			 }
			 catch(SQLException se)
			 {
				 se.printStackTrace();
			 }
			 try{
				 if(con!=null)
					con.close();
			 }
			 catch(SQLException se)
			 {
				 se.printStackTrace();
			 }
			 
			 try{
				if(scn!=null)
				scn.close();
			 }
			 catch(Exception se)
			 {
				 se.printStackTrace();
			 }
		 
		 }// close finally.
		
	}// close main method.

} // close class.
