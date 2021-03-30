import java.io.File;
public class FileCreate {
   
   public static void main(String[] args) {

      
 File a = new File("C:/Users/Dipak Kadam/Desktop/File Handling/dipak.txt");      

if(a!=null)
{
System.out.println("File Created");
}
else
{
System.out.println("File  Not Created");
}

   }
}