import java.io.File;    
import java.io.IOException;    
public class DeleteTextFile
{    
public static void main(String[] args)  
{    
try  
{  
File file = new File("C://Users/Dipak Kadam/Desktop/delete/del.txt");             //creates a file instance  
file.deleteOnExit();                 //deletes the file when JVM terminates  
System.out.println("Done");  
Thread.sleep(1000);    
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}    
}  