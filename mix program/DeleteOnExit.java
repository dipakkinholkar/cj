import java.io.File;  
import java.io.IOException;  
public class DeleteOnExit 
{  
public static void main(String[] args)  
{  
File temp;  
try  
{  
temp = File.createTempFile("abc", ".temp");     //creating a .temp file  
System.out.println("Temp file created at location: " + temp.getAbsolutePath());      
temp.deleteOnExit();                     //delete file on runtime exit  
System.out.println("Temp file exists : " + temp.exists());  
}   
catch (IOException e)  
{  
e.printStackTrace();  
}  
}  
}  