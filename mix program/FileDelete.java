import java.io.File;  
public class FileDelete  
{  
public static void main(String[] args)  
{     
try  
{         
File f= new File("                         ");           //file to be delete  
if(f.delete())                      //returns Boolean value  
{  
System.out.println(f.getName() + " deleted");   //getting and printing the file name  
}  
else  
{  
System.out.println("failed");  
}  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  